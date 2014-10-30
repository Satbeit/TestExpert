package my.camel;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

/**
 * Created by sanket on 10/28/2014.
 */
@Component
public class TestAction {

    Logger log = Logger.getLogger(TestAction.class.getName());

    @Produce
    ProducerTemplate producerTemplate;

    public void startCamelRouting() {
        for (int i = 0; i <1 ; i++) {
            log.info("***** Start camel routing *****");
            Collection cl = new ArrayList();
            cl.add("1");
            cl.add("2");
            producerTemplate.sendBody("seda:test", cl);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
