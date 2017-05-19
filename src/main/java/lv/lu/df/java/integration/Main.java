package lv.lu.df.java.integration;


import lv.lu.df.java.integration.producer.JSONFileProducer;
import lv.lu.df.java.integration.producer.XMLFileProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Main extends Thread{

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        /*** Wait for JVM to warm up and instantiate any potential lazy beans or configuration ***/
        context.getBean(XMLFileProducer.class).feedSampleXML();
        context.getBean(JSONFileProducer.class).feedSampleJSON();
        /*****************************************************************************************/

        long totalXMLTime  = context.getBean(XMLFileProducer.class).feedSampleXML();
        long totalJSONTime = context.getBean(JSONFileProducer.class).feedSampleJSON();

        System.out.println("Total XML time processing " + totalXMLTime);
        System.out.println("Total JSON time processing " + totalJSONTime);
    }
}
