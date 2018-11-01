package week7.task1;

public class Multiplication extends BinaryExpression {
    Expression left;
    Expression right;
    public Multiplication(Expression _left, Expression _right){
        left= _left;
        right= _right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        int a= left.evaluate()*right.evaluate();
        return"Tich là"+a;
    }

    @Override
    public int evaluate() {
        return left.evaluate()*right.evaluate();
    }
}
