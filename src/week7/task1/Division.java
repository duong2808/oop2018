package week7.task1;

public class Division extends BinaryExpression {
    Expression left;
    Expression right;
    public Division(Expression _left, Expression _right){
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
        try{
            int a= left.evaluate()/right.evaluate();
            return " Thuong la"+a;
        }
        catch(ArithmeticException e){
            return "Error ArithmeticException";
        }
    }

    @Override
    public int evaluate() {
        try{
            return left.evaluate()/right.evaluate();
        }
        catch(ArithmeticException e){
            System.out.println("Error ArithmeticException");
            return 0;
        }
    }
}
