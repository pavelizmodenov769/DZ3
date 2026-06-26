package strategy;

public class Substraction implements Operation {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
