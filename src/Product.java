public class Product {
    private int id;
    private int price;
    private String name;

    public Product (int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
     }

    public String toString() {
        return id + " " + name + " " + price + " руб/шт";
    }
}
