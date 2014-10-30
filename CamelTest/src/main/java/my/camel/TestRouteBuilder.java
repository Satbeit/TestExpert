package my.camel;

import my.camel.action.Generate;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TestRouteBuilder extends RouteBuilder {


        @Override
        public void configure() throws Exception {
            from("seda:invoice")
                    .log(LoggingLevel.INFO, "Invoices processing STARTED")
                    .split(body())
                    .bean(Generate.class, "process")
                    .end();
        }
    }