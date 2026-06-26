package strategy;

public class Calculator {
    public static void main(String[] args) {

        Context calc = new Context(new Addition());
        System.out.println("5 + 3 = " + calc.calculate(5, 3));

        calc.setOperation(new Substraction());
        System.out.println("5 - 3 = " + calc.calculate(5, 3));

        calc.setOperation(new Multiplication());
        System.out.println("5 * 3 = " + calc.calculate(5, 3));
    }
}