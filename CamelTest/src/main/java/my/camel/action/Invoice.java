package my.camel.action;


import my.camel.AbstractExchange;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Invoice<T> extends AbstractExchange {

    List<T> list;

    public Invoice() {
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "list=" + list +
                '}';
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Invoice(List<T> list) {

        this.list = list;
    }
}
