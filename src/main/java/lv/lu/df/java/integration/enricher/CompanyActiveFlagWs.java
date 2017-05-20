package lv.lu.df.java.integration.enricher;


import lv.lu.df.java.integration.model.dto.CompanyDTO;
import org.apache.camel.Exchange;

public class CompanyActiveFlagWs {

    public void isCompanyActive(Exchange exchange) throws InterruptedException {
        exchange.getIn().getBody(CompanyDTO.class).setActive(this.getCompanyInfo(exchange.getIn().getBody(CompanyDTO.class)));
    }

    private boolean getCompanyInfo(CompanyDTO body) throws InterruptedException {
        if(System.currentTimeMillis() % 2 == 0) return true;
        else return false;
    }
}
