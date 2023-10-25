public class Dog extends Animal {

    private String name;

    public Dog() {
        super();
        this.name = "";
    }

    public Dog(String name) {
        super();
        this.name = name;
    }

    public Dog(String name, byte age) {
        super(age);
        this.name = name;
    }

    public String speak() {
        return "Woof";
    }
}
