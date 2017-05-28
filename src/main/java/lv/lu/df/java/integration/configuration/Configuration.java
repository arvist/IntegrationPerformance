package lv.lu.df.java.integration.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import lv.lu.df.java.integration.converter.CompanyDTOConverter;
import lv.lu.df.java.integration.enricher.CompanyActiveFlagWs;
import lv.lu.df.java.integration.model.jaxb.Company;
import lv.lu.df.java.integration.processor.ContentFilterProcessor;
import lv.lu.df.java.integration.routes.Routes;
import lv.lu.df.java.integration.service.DatabaseService;
import lv.lu.df.java.integration.service.PeriodicBatchInsertChecker;
import org.apache.camel.Processor;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.spring.SpringCamelContext;
import org.apacheextras.camel.component.vtdxml.VtdXmlXPathBuilder;
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
    public PeriodicBatchInsertChecker periodicBatchInsertChecker(DatabaseService service){
        PeriodicBatchInsertChecker periodicBatchInsertChecker = new PeriodicBatchInsertChecker(service);
        periodicBatchInsertChecker.start();
        return periodicBatchInsertChecker;
    }

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
    public VtdXmlXPathBuilder vtdPathBuilder(){
        return new VtdXmlXPathBuilder("/marketData/company");
    }

    @Bean
    public CompanyActiveFlagWs companyActiveFlagWs() {return new CompanyActiveFlagWs();}

    @Bean
    public List<String> supportedCompanies(){
        return Arrays.asList("ZGEQ","XAFG","AAPX","ADCA","AGOP","VAVS","AGAC","GEAE","BNVD","DAFA","GASS","SAGQ","BASE","BEGV","APPL","GOOG","TSLA","AAAA");
    }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }

    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        final ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?rewriteBatchedStatements=true");
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
        properties.put("hibernate.show_sql","false");
        properties.put("hibernate.jdbc.batch_size","1");
        properties.put("hibernate.order_inserts", "true");
        properties.put("hibernate.order_updates", "true");
        properties.put("hibernate.jdbc.batch_versioned_data", "true");
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
