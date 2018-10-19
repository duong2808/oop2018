package week4.task2;

public class Circle extends Shape{
        final double PI = Math.PI;
        double radius;
        Circle(){
            this.radius =1.0;
        }
        Circle(double a){
            this.radius = a;
        }
        public Circle(double radius_, String color_, boolean finled_){
            super(color_, finled_);
            this.radius = radius_;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }
        public double getArea(){
            return radius*radius*PI;
        }
        public double Perimeter(){
            return radius*2*PI;
        }

        @Override
        public String toString() {
            return super.toString();
        }

        public static void main(String[] args) {
            Circle ac =new Circle(3.0, "do", true);
            System.out.println("Dien tich hinh chu nhat: "+ac.getArea());
            System.out.println(("Chu vi hinh tron: "+ac.Perimeter()));
        }
}
