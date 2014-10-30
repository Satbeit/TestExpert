package my.camel.action;

import my.camel.TestRouteBuilder;
import my.camel.domain.Coffee;
import my.camel.domain.Entity;
import my.camel.domain.Tea;
import org.apache.camel.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

@Component
public class Generate {

    Logger log = Logger.getLogger(Generate.class.getName());
    @Produce
    ProducerTemplate producerTemplate;

    public void placeOrder(Exchange exchange) throws InterruptedException {
        Order order = new Order();
        List<Entity> list = new ArrayList<Entity>();
        list.add(new Coffee(Coffee.Type.BLACK_COFFE));
        list.add(new Tea(Tea.Type.GREEN_TEA));
        list.add(new Tea(Tea.Type.INDIAN_TEA));
        order.setList(list);
        Collection<Object> objects = new ArrayList<>();
        objects.add(order);
        producerTemplate.sendBody("seda:generateInvoice", objects);
        log.info("Order has been placed with items generate invoice.");
    }

    public void generateInvoice(@Body Message message) throws InterruptedException {
        Collection<Order> entities = (Collection<Order>) message.getBody();

        for (Object entity : entities) {

            System.out.println("------- \t \t -------");
            System.out.println("Item \t \t Price ");
            System.out.println("------- \t \t -------");
            for (Object obj : ((Order) entity).getList()) {
                if (obj instanceof Coffee) {
                    Coffee coffee = (Coffee) obj;
                    System.out.println(coffee.getType().getName() + "\t\t" + coffee.getType().getPrice());
                } else if (obj instanceof Tea) {
                    Tea tea = (Tea) obj;
                    System.out.println(tea.getType().getName() + "\t\t" + tea.getType().getPrice());
                }

            }
        }
    }

}
