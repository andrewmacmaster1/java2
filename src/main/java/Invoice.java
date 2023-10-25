public class Invoice {
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;
    private ShoppingCart cart;

    public Invoice(String name, String address, String city, String state, int zip, ShoppingCart cart) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.cart = cart;
    }

    public String toString() {
        String output = "";
        output += "Ship to:\n  " + name + "\n  " + address + "\n  " + city + ", " + state + " " + zip + "\n";
        output +="\n";
        output += "Items\n";
        output += "-----\n";
        int longest = cart.getCart().stream().map(Item::length).max(Integer::compareTo).get();
        for (Item item : cart.getCart()) {
            int repeat1 = (item.name.length() < longest) ? (longest - item.name.length() + 1) : 1;
            int repeat2 = (item.price < 10) ? 2:1;
            int repeat3 = (item.price*item.count < 10) ? 2:1;

            output += item.name +
                    " ".repeat(repeat1) + "$" +
                    String.format("%.2f", item.price) +
                    " ".repeat(repeat2) +
                    "(" + item.count + ")" +
                    " ".repeat(repeat3) + "$" +
                    String.format("%.2f", item.count*item.price) + "\n";
        }
        output += "\n";
        if (cart.getSubtotal() > 10) {
            output += "Shipping: Free\n";
        }
        else {
            output += "Shipping: " + String.format("%.2f", cart.getShipping()) + "\n";
        }
        output += "\n";
        output += "Total Cost\n";
        output += "---------\n";
        output += cart.getTotal();

        return output;
    }
}
