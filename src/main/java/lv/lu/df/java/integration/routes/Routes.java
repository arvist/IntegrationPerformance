package lv.lu.df.java.integration.routes;


import com.fasterxml.jackson.databind.ObjectMapper;
import lv.lu.df.java.integration.enricher.CompanyActiveFlagWs;
import lv.lu.df.java.integration.model.dto.CompanyDTO;
import lv.lu.df.java.integration.model.jaxb.Company;
import lv.lu.df.java.integration.service.DatabaseService;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.xml.XPathBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Routes extends RouteBuilder {

    @Autowired
    private JaxbDataFormat jaxbDataFormat;
    @Autowired
    private Processor contentFilter;
    @Autowired
    private XPathBuilder xPathBuilder;
    @Autowired
    private List<String> supportedCompanies;
    @Autowired
    private CompanyActiveFlagWs companyActiveFlagWs;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private DatabaseService databaseService;

    public void configure() throws Exception {

        from("direct:inboxXML")
                .split(xPathBuilder)
                .log(LoggingLevel.INFO,"After Split")
                .convertBodyTo(String.class)
                .unmarshal(jaxbDataFormat)
                .convertBodyTo(CompanyDTO.class)
                .process(contentFilter)
                .to("direct://company-data-processing");

        from("direct:inboxJSON")
                .convertBodyTo(String.class)
                .unmarshal().json(JsonLibrary.Jackson, Company.class)
                .convertBodyTo(CompanyDTO.class)
                .process(contentFilter)
                .to("direct://company-data-processing");

        from("direct://company-data-processing")
                .log(LoggingLevel.INFO,body().toString())
                .choice()
                    .when(exchange -> exchange.getIn().getBody(CompanyDTO.class).getSeries().iterator().next().getMin()/100.00 < 0)
                        .log(LoggingLevel.INFO,"DROP, series minimum value under 100. " +body().toString())
                        .stop()
                    .when(exchange -> !supportedCompanies.contains(exchange.getIn().getBody(CompanyDTO.class).getSymbol()))
                        .log(LoggingLevel.INFO,"DROP, company not in supported company list. " + body().toString())
                        .stop()
                    .when(exchange -> exchange.getIn().getBody(CompanyDTO.class).getSeries().isEmpty())
                        .log(LoggingLevel.INFO,"DROP, company series entry is empty. " + body().toString())
                        .stop()
                .end()
                .choice()
                    .when(exchange -> exchange.getIn().getBody(CompanyDTO.class).isActiveSet() == false)
                        .log(LoggingLevel.INFO,"Before WS to acquire more information about company " + body())
                        .bean(companyActiveFlagWs,"isCompanyActive")
                        .log(LoggingLevel.INFO,"After WS to acquire more information about company " + body())
                .end()
                .bean(databaseService,"insertCompanyDTOInDB")
                .end();

    }
}
