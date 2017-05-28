package lv.lu.df.java.integration.producer;

import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.impl.DefaultMessage;
import org.apache.camel.spring.SpringCamelContext;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class XMLFileProducer {

    @Autowired
    private SpringCamelContext camelContext;

    // Feeds 1000 XML messages for processing, returns total elapsed time in camel routes
    public long feedSampleXML() throws IOException {

        File [] files = new File("C:/testData/xml/").listFiles();
        ProducerTemplate producer = this.camelContext.createProducerTemplate();
        long totalTime = 0;
        for(int i=0; i< 100; i++) {
            for (File file : files) {
                String xmlContents = FileUtils.readFileToString(file);
                Exchange exchange = new DefaultExchange(this.camelContext);
                exchange.setIn(new DefaultMessage());
                exchange.getIn().setBody(xmlContents);
                long start = System.currentTimeMillis();
                producer.send("direct:inboxXML", exchange);
                long end = System.currentTimeMillis();
                totalTime = totalTime + (end - start);
            }
        }
        return totalTime;
     }
}