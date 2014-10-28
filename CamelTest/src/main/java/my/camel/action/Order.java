package my.camel.action;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Order<T> {

    List<T> list;

    public Order() {
    }

    @Override
    public String toString() {
        return "Orderq{" +
                "list=" + list +
                '}';
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Order(List<T> list) {

        this.list = list;
    }
}
