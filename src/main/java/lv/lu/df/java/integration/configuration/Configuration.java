package lv.lu.df.java.integration.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import lv.lu.df.java.integration.converter.CompanyDTOConverter;
import lv.lu.df.java.integration.enricher.CompanyActiveFlagWs;
import lv.lu.df.java.integration.model.jaxb.Company;
import lv.lu.df.java.integration.processor.ContentFilterProcessor;
import lv.lu.df.java.integration.routes.Routes;
import org.apache.camel.Processor;
import org.apache.camel.builder.xml.XPathBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.spring.SpringCamelContext;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

@Component
public class Configuration {

    @Autowired
    private Routes routes;

    @Autowired
    private CompanyDTOConverter companyDTOConverter;

    @Bean
    public JaxbDataFormat jaxb() {
        JaxbDataFormat jaxbDataFormat = new JaxbDataFormat();
        jaxbDataFormat.setContextPath(Company.class.getPackage().getName());
        jaxbDataFormat.setSchemaLocation("Data.xsd");
        return jaxbDataFormat;
    }

    @Bean
    public Processor contentFilterProcessor() {
        return new ContentFilterProcessor();
    }

    @Bean
    public SpringCamelContext camelContext(ApplicationContext applicationContext) throws Exception {
        SpringCamelContext camelContext = new SpringCamelContext(applicationContext);
        camelContext.addRoutes(routes);
        camelContext.start();
        camelContext.startAllRoutes();
        camelContext.getTypeConverterRegistry().addTypeConverters(companyDTOConverter);
        return camelContext;
    }

    @Bean
    public XPathBuilder xPathBuilder() {
        return new XPathBuilder("/marketData/company");
    }

    @Bean
    public CompanyActiveFlagWs companyActiveFlagWs() {return new CompanyActiveFlagWs();}

    @Bean
    public List<String> supportedCompanies(){
        return Arrays.asList("APPL","GOOG", "TSLA");
    }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }

    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        final ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test"); //?rewriteBatchedStatements=true
        dataSource.setUser("test");
        dataSource.setPassword("1234");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setMinPoolSize(1);
        dataSource.setMaxAdministrativeTaskTime(10);
        return dataSource;
    }

    @Bean
    public Properties hibernateProperties(){
        final Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        properties.put("hibernate.hbm2ddl.auto", "create-drop");
        properties.put("show_sql","true");

        return properties;
    }

    @Bean
    public EntityManagerFactory entityManagerFactory(DataSource dataSource, Properties hibernateProperties ){
        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        em.setJpaProperties(hibernateProperties);
        em.setPersistenceUnitName("TestPersistanceDB");
        em.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        em.afterPropertiesSet();

        return em.getObject();
    }

}
