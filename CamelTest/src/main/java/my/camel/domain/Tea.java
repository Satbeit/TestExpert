package my.camel.domain;

/**
 * Created by sanket on 10/28/2014.
 */
public class Tea implements Entity{
    String name ;

    double price ;

    public Tea() {
    }

    public Tea(String name, double price) {
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
        return "Tea{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
