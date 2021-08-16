package lesson18;

public class Calculator {

    private final CalculatorHelp calculatorHelp;

    public Calculator(CalculatorHelp calculatorHelp) {
        this.calculatorHelp = calculatorHelp;
    }

    public int sum(Integer first, Integer second) {
        return calculatorHelp.sumHelper(first, second);
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public int calculate(String value) {
        return Integer.parseInt(value);
    }
}
