package week7.task1;

public class Addition extends BinaryExpression{
    Expression left;
    Expression right;
    public Addition(Expression _left, Expression _right){
        left = _left;
        right =_right;
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
        int a= left.evaluate()+right.evaluate();
        return "Tong la: " + a;
    }

    @Override
    public int evaluate() {

        return left.evaluate()+right.evaluate();
    }
}
