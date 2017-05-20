package lv.lu.df.java.integration.processor;


import lv.lu.df.java.integration.model.dto.CompanyDTO;
import lv.lu.df.java.integration.model.dto.Serie;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.ArrayList;
import java.util.List;

public class ContentFilterProcessor implements Processor{

    public void process(Exchange exchange) throws Exception {

        CompanyDTO companyDTO = exchange.getIn().getBody(CompanyDTO.class);

        List<Serie> serieList = new ArrayList<>();

        List<Serie> fullList = companyDTO.getSeries();
        fullList.sort((Serie o1, Serie o2) -> (int) (o1.getMax() / o2.getMax()));
        serieList.add(fullList.get(0)); // Minimum
        serieList.add(fullList.get(fullList.size()-1)); //Maximum

        companyDTO.setSeries(serieList);

    }
}
