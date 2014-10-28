package my.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TestRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
            from("direct://Invoice")
                .to("generate")
                .end();
            from("direct://Order")
                .to("generate")
                .end();
    }
}
