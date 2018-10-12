package week4.task2;

public class Rectangle extends Shape {
    public double width;
    public double length;
    public Rectangle(){
        this.width =1.0;
        this.length =1.0;
    }
    public Rectangle(double width_, double length_){
        this.width = width_;
        this.length = length_;
    }
    public Rectangle(double width_, double length_, String clor_, boolean lilled){
        super(clor_, lilled);
        this.width = width_;
        this.length = length_;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2.3,4.5,"xanh", true);
        System.out.println("Dien tich hinh chu nhat: "+rec.getArea());
        System.out.println("Chu vi hinh chu nhat:"+rec.getPerimeter());
    }
}
