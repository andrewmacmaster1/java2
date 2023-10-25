public class Item {

    public double price;
    public int count;
    public String name;

    public Item(double price, int count, String name) {
        this.price = price;
        this.count = count;
        this.name = name;
    }

    public int length() {
        return name.length();
    }
}
