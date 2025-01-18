package composite.calculator;


public class Expression implements ArithmeticExpression {
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int calculate() {
        int value = 0;
        switch (operation) {
            case ADD -> value = leftExpression.calculate() + rightExpression.calculate();
            case SUBTRACT -> value = leftExpression.calculate() - rightExpression.calculate();

            case MULTIPLY -> {
                value = leftExpression.calculate() * rightExpression.calculate();
            }
            case DIVIDE -> {
                value = leftExpression.calculate() / rightExpression.calculate();
            }
        }
        return value;
    }
}
