package week7.task1;

public class Square extends Numeral {
    Expression expression;

    public Square(Expression _expression) {

        expression=_expression;

    }

    @Override

    public String toString() {

        return "Binh phuong la: "+ expression.evaluate()*expression.evaluate()  ;

    }

    @Override

    public int evaluate() {

        return expression.evaluate()*expression.evaluate();

    }
}
