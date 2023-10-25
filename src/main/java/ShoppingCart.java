import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> cart;
    private double shipping;
    private double total;
    private double subtotal;

    public ShoppingCart() {
        cart = new ArrayList<>();
        this.shipping = 0;
    }

    public ShoppingCart(double shipping) {
        cart = new ArrayList<>();
        this.shipping = shipping;
    }

    public void addItem(Item new_item) {
        cart.add(new_item);
    }

    public void calculateTotal() {
        for (Item item : cart) {
            total += item.price * item.count;
        }

        subtotal = total;
        double tax = 0.1*total;
        if (total < 10) {
            total += shipping;
        }
        total += tax;

    }

    public ArrayList<Item> getCart() {
        return cart;
    }

    public String getTotal() {
        return "$" + String.format("%.2f",total);
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getShipping() {
        return shipping;
    }

    public Invoice shipOrder(String name, String address, String city, String state, int zip) {
        return new Invoice(name, address, city, state, zip, this);
    }
}
