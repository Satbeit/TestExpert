package my.camel.action;

import org.apache.camel.Message;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Generate {

    public void process(Message message) {
        System.out.println("Invoice has been generated" + message);
    }

    public void generateOrder(List<Order> orderList) {
        System.out.println("Order has been generated" + orderList);
    }
}
