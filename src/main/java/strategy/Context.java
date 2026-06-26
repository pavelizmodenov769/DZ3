package strategy;

import java.util.Objects;

public class Context {
    private Operation operation;

    public Context(Operation operation) {
        this.operation = Objects.requireNonNull(operation, "operation не может быть null");
    }

    public void setOperation(Operation operation) {
        this.operation = Objects.requireNonNull(operation, "operation не может быть Null");
    }

    public int calculate(int a, int b) {
        return operation.execute(a, b);
    }
}