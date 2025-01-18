package composite.calculator;

public class Number implements ArithmeticExpression {
    int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int calculate() {
        System.out.println("Number is :" + value);
        return value;
    }
}
