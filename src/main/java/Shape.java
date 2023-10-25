abstract class Shape {

    int length;
    int width;

    public String draw() {
        String shape = "";
        shape += "*".repeat(length) + "\n";
        for (int i = 1; i < width - 1; i++) {
            shape += "*" + " ".repeat(length - 2) + "*\n";
        }
        shape += "*".repeat(length) + "\n";
        return shape;
    }
}
