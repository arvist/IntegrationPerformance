package lv.lu.df.java.integration.converter;


import lv.lu.df.java.integration.model.dto.CompanyDTO;
import lv.lu.df.java.integration.model.dto.Serie;
import lv.lu.df.java.integration.model.jaxb.Company;
import org.apache.camel.Converter;
import org.apache.camel.TypeConverters;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Converter
@Component
public class CompanyDTOConverter implements TypeConverters {

    private static DateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy");

    @Converter
    public static CompanyDTO convert(Company company){
        CompanyDTO companyDTO = new CompanyDTO();

        companyDTO.setName(company.getName());
        companyDTO.setSymbol(company.getSymbol());
        companyDTO.setSeries(new ArrayList<>());

        for(int i = 0; i<company.getSeries().getClose().getValues().getElement().size(); i++){
            Serie serie = new Serie();

            try {
                serie.setDate(dateFormat.parse(company.getSeriesDates().getElement().get(i).substring(4)));
            } catch (ParseException p){
                p.printStackTrace();
            }
            serie.setMin(new BigDecimal(company.getSeries().getLow().getValues().getElement().get(i)));
            serie.setMax(new BigDecimal(company.getSeries().getHigh().getValues().getElement().get(i)));

            companyDTO.getSeries().add(serie);
        }


        return companyDTO;
    }
}
