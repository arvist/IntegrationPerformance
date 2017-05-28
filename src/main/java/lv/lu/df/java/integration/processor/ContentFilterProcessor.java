package lv.lu.df.java.integration.processor;


import lv.lu.df.java.integration.model.dto.CompanyDTO;
import lv.lu.df.java.integration.model.dto.Serie;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContentFilterProcessor implements Processor{

    public void process(Exchange exchange) throws Exception {

        CompanyDTO companyDTO = exchange.getIn().getBody(CompanyDTO.class);

        List<Serie> serieList = new ArrayList<>();

        List<Serie> fullList = companyDTO.getSeries();
        fullList.sort((o1, o2) -> o1.getMax().compareTo(o1.getMax()));
        serieList.add(fullList.get(0)); // Minimum
        serieList.add(fullList.get(fullList.size()-1)); //Maximum

        BigDecimal total = new BigDecimal(0);
        BigDecimal counter = new BigDecimal(0);
        for(Serie serie : fullList){
            total.add(serie.getMax()).add(serie.getMin());
            counter = counter.add(new BigDecimal(2));
        }

        companyDTO.setSeries(serieList);

    }
}
