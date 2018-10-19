package week5_6;

import java.util.concurrent.Callable;
public class Circle extends Shape{

    private double radius = 1.0;

    final double PI = 3.14;



    public Circle(){



    }



    public Circle(double radius){

        this.radius = radius;

    }



    public Circle(double radius, String color , boolean filled , Point p){

        this.radius = radius;

        setPoint(p);

        setColor(color);

        setFilled(filled);

    }



    public double getRadius() {

        return radius;

    }



    public void setRadius(double radius) {

        this.radius = radius;

    }



    //tinh dien tich

    public double getArea(){

        double x = PI * getRadius() * getRadius();



        return x;

    }



    //tinh chu vi

    public double getPerimeter(){

        double x = 2 * PI * getRadius();

        return x;

    }



    public boolean ssCircle(Shape c1){

        Circle c2 = (Circle)c1;

        if (c2.getRadius() == this.getRadius())

            return true;

        return false;

    }



    public String toString(){

        return super.toString() + " Radius: " + radius;

    }



}