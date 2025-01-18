package composite.calculator;

public class Main {
    public static void main(String[] args) {

        ArithmeticExpression expression = new Expression(new Number(34),
                new Expression(new Number(3), new Number(2), Operation.ADD), Operation.MULTIPLY);
        System.out.println(expression.calculate());
        
    }
}
