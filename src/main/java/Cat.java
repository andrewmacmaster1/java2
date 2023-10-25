public class Cat extends Animal {

    private String name;

    public Cat() {
        super();
        this.name = "";
    }

    public Cat(String name) {
        super();
        this.name = name;
    }

    public Cat(String name, byte age) {
        super(age);
        this.name = name;
    }

    public String speak() {
        return "Meow";
    }
}
