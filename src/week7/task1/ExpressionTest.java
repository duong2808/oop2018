package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression a0 = new Numeral(3);
        Expression a1 = new Numeral(22);
        Expression a2 = new Numeral(8);
        Expression a3 = new Numeral(0);

        Expression c0 = new Addition(a1,a0);
        System.out.println(c0.toString());

        Expression c1 = new Square(a2);
        System.out.println(c1.toString());

        Expression c2 = new Division(a0, a3);
        System.out.println(c2.toString());

        Expression c3 = new Multiplication(a1, a2);
        System.out.println(c3.toString());

        Expression c4 = new Subtraction(a1,a0);
        System.out.println(c4.toString());
    }
}
