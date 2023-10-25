public class Person extends Animal {


    private String firstName;
    private String lastName;
    private int social;
    private static int count;

    public Person() {
        super();
        this.firstName = "";
        this.lastName = "";
        this.social = -1;
        count++;
    }

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.social = -1;
        count++;
    }

    public Person(String firstName, String lastName, byte age, int social) {
        super(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.social = social;
        count++;
    }

    public String speak() {
        String result;
        if (firstName.isEmpty() && lastName.isEmpty()) {
            result = "I don't have a name";
        }
        else {
            result = "My name is " + firstName + " " + lastName;
        }
        if (this.getAge() != -1) {
            result += " and I am " + this.getAge() + " years old";
        }
        result += ".";
        return result;
    }

    public String toString() {
        String result;
        if (firstName.isEmpty() && lastName.isEmpty()) {
            result = "N/A";
        }
        else {
            result = firstName + " " + lastName;
        }
        if (social != -1) {
            result += " " + String.valueOf(social).substring(5);
        }
        return result;
    }

    public static int getPersonCount() {
        return count;
    }
}
