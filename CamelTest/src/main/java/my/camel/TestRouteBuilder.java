package my.camel;

import my.camel.action.Generate;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
    public class TestRouteBuilder extends RouteBuilder {

    public final String PLACED_ORDER = "seda:placeOrder";
    public final String GENERATE_INVOICE = "seda:generateInvoice";


    @Override
    public void configure() throws Exception {
        from("seda:test")
                .log(LoggingLevel.INFO, "Invoices processing STARTED")
                .to(PLACED_ORDER);

        from(PLACED_ORDER)
                .log(LoggingLevel.INFO, "Placing Order")
                .bean(Generate.class, "placeOrder");
        from(GENERATE_INVOICE)
                .log(LoggingLevel.INFO, "Generating Invoice")
                .bean(Generate.class, "generateInvoice");

    }
}