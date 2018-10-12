package week4.task2;

public class Square extends Rectangle{

    int Side;

    public Square() {}

    public Square(int side) {

        Side = side;

    }

    public Square(String _color, Boolean _Filled, double width, double length, int side) {


        Side = side;

    }



    public void setSide(int side) {

        Side = side;

    }



    public int getSide() {

        return Side;

    }



    /**

     * set lạ giá trị cho chiều rộng bằng cạnh hình vuông

     * @param side trả lại giá trị cnhj hình vuông

     */

    @Override

    public void setWidth(double side) {

        super.setWidth(side);

    }



    @Override

    public double getWidth() {

        return super.getWidth();

    }



    /**

     * định nghĩa lại giá trị cho length

     * @param side trả lại độ dài theo cạnh hình vuông

     */

    @Override

    public void setLength(double side) {

        super.setLength(side);

    }



    @Override

    public double getLength() {

        return super.getLength();

    }

    /**

     * dùng để trả về đối tượng dạng chuõi

     * @return chuỗi tương ứng

     */

    @Override

    public String toString() {

        return super.toString();

    }

}