package my.camel;

import my.camel.action.Invoice;
import my.camel.domain.Coffee;
import my.camel.domain.Entity;
import org.apache.camel.Producer;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by sanket on 10/28/2014.
 */
@Component
public class TestAction {

    Logger log = Logger.getLogger(TestAction.class.getName());

    @Autowired
    ProducerTemplate producerTemplate;


    public void generateInvoices() {
        Invoice invoice = new Invoice();
        List<Entity> coffeeList = new ArrayList<Entity>();
        Coffee blackCoffee = new Coffee("Black ", 5);
        Coffee capachino = new Coffee("Capachino", 5);
        coffeeList.add(blackCoffee);
        coffeeList.add(capachino);
        invoice.setList(coffeeList);
        producerTemplate.send("direct:Invoice",  invoice);
        log.info("Invoice items have been sent to generate invoice.");

    }
}
