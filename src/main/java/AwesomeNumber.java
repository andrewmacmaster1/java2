public class AwesomeNumber {
    int number;

    public AwesomeNumber() {
        this.number = 0;
    }

    public AwesomeNumber(int number) {
        this.number = number;
    }

    public static AwesomeNumber add(AwesomeNumber n1, AwesomeNumber n2) {
        return new AwesomeNumber(n1.number + n2.number);
    }

    public static AwesomeNumber subtract(AwesomeNumber n1, AwesomeNumber n2) {
        return new AwesomeNumber(n1.number - n2.number);
    }

    public String toString() {
        return Integer.toString(number);
    }
}
