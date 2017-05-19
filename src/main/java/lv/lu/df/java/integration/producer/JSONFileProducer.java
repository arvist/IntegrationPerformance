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
public class JSONFileProducer {

    @Autowired
    private SpringCamelContext camelContext;

    // Feeds 1000 JSON messages for processing, returns total elapsed time in camel routes
    public long feedSampleJSON() throws IOException {

        File [] files = new File("C:/testData/json/").listFiles();
        ProducerTemplate producer = this.camelContext.createProducerTemplate();
        long totalTime = 0;
        for(int i=0; i < 100; i++) {
            for (File file : files) {
                String jsonContents = FileUtils.readFileToString(file);
                Exchange exchange = new DefaultExchange(this.camelContext);
                exchange.setIn(new DefaultMessage());
                exchange.getIn().setBody(jsonContents);
                long start = System.currentTimeMillis();
                producer.send("direct:inboxJSON", exchange);
                long end = System.currentTimeMillis();
                totalTime = totalTime + (end - start);
            }
        }
        return totalTime;
    }
}
