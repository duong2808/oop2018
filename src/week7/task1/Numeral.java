package week7.task1;

public class Numeral extends Expression{
    private int value;
    public Numeral(){};
    public Numeral(int _value){
        value = _value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Sô hạng là: "+value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
