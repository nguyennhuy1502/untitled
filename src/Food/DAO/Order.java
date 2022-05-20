package Food.DAO;

public record Order(String id, String name, String item) {
    @Override
    public String id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String item() {
        return item;
    }

    public Order {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", item='" + item + '\'' +
                '}';
    }
}
