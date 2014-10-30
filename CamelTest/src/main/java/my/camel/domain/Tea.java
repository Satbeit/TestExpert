package my.camel.domain;

/**
 * Created by sanket on 10/28/2014.
 */
public class Tea implements Entity{

    Type type;

    public Type getType() {
        return type;
    }

    public Tea() {

    }

    @Override
    public String toString() {
        return "Tea{" +
                "type=" + type +
                '}';
    }

    public Tea(Type type) {

        this.type = type;
    }

    public enum Type {
        GREEN_TEA("Green Tea", 10),
        INDIAN_TEA("Indian Tea", 20);

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
}
