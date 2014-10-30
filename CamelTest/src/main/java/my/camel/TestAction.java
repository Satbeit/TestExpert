package my.camel;

import my.camel.action.Invoice;
import my.camel.domain.Coffee;
import my.camel.domain.Entity;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by sanket on 10/28/2014.
 */
@Component
public class TestAction {

    Logger log = Logger.getLogger(TestAction.class.getName());

    @Produce(uri = "seda:invoice")
    ProducerTemplate producerTemplate;

    public void generateInvoices() throws InterruptedException {
        Invoice invoice = new Invoice();
        List<Entity> coffeeList = new ArrayList<Entity>();
        Coffee blackCoffee = new Coffee("Black ", 5);
        Coffee capachino = new Coffee("Capachino", 5);
        coffeeList.add(blackCoffee);
        coffeeList.add(capachino);
        invoice.setList(coffeeList);
        Collection<Object> objects = new ArrayList<>();
        objects.add(invoice);
        producerTemplate.sendBody(objects);
        log.info("Invoice items have been sent to generate invoice.");
    }
}
