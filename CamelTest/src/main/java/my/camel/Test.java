package my.camel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sanket on 10/28/2014.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext app = new ClassPathXmlApplicationContext("META-INF\\spring\\invoices-context.xml");
        System.out.println(app);
        TestAction testAction = (TestAction) app.getBean("testAction");
        testAction.generateInvoices();
    }
}
