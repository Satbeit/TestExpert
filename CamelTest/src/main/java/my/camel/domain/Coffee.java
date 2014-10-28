package my.camel.domain;

import java.io.Serializable;

/**
 * Created by sanket on 10/28/2014.
 */
public class Coffee implements Entity{
    String name ;

    double price ;

    public Coffee() {
    }

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
