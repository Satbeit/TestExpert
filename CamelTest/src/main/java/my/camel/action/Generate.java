package my.camel.action;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Generate {

    public void process(@Body Message message) {
        System.out.println("Invoice has been generated" + message);
    }

}
