package week4.task2;

public class Shape {
        public String color;
        public boolean filled;
        Shape(){
            this.color = "red";
            this.filled = true;
        };
        Shape(String color_, boolean filled_){
            this.color = color_;
            this.filled = filled_;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public boolean isFilled() {
            return filled;
        }

        @Override
        public String toString() {
            return super.toString();
        }

}
