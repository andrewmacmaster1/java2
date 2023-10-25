import java.util.ArrayList;

public class Calculator implements Calculatable {

    private ArrayList<String> history;

    public Calculator() {
        history = new ArrayList<>();
    }

    public Integer add(Integer number1, Integer number2) {
        history.add(number1 + " + " + number2 + " = " + (number1 + number2));
        return number1 + number2;
    }

    public Integer subtract(Integer number1, Integer number2) {
        history.add(number1 + " - " + number2 + " = " + (number1 - number2));
        return number1 - number2;
    }

    public Integer multiply(Integer number1, Integer number2) {
        history.add(number1 + " * " + number2 + " = " + (number1 * number2));
        return number1 * number2;
    }

    public Integer divide(Integer number1, Integer number2) {
        history.add(number1 + " / " + number2 + " = " + (number1 / number2));
        return number1 / number2;
    }

    public String getHistory() {
        return history.toString();
    }
}
