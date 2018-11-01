package week7.task1;

public class Square extends Numeral {
    Expression expression;

    public Square(Expression _expression) {

        expression=_expression;

    }

    @Override

    public String toString() {

        return "Bình phương là: "+ expression.evaluate()*expression.evaluate()  ;

    }

    @Override

    public int evaluate() {

        return expression.evaluate()*expression.evaluate();

    }
}
