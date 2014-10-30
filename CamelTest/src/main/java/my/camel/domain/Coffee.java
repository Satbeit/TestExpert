package my.camel.domain;

import java.io.Serializable;

/**
 * Created by sanket on 10/28/2014.
 */
public class Coffee implements Entity{

    Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Coffee() {

    }

    public Coffee(Type type) {

        this.type = type;
    }

    public enum Type {
        BLACK_COFFE("black coffe", 5),
        BLACK_COFFE_W_SUGAR("black coffe with sugar", 10);

        String name ;
        long price ;

        Type(String name, long price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public long getPrice() {
            return price;
        }
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type=" + type +
                '}';
    }
}
