package week2.task2;



public class Fraction {
	private int numerator, denominator;


    // TODO: khai báo các thu?c tính



    public Fraction(int numerator, int denominator) {
	this.numerator = numerator;
	this.denominator = denominator;
        // TODO: kh?i t?o giá tr? cho các thu?c tính numberator (t? s?), denominator (m?u s?)

    }



    public Fraction add(Fraction other) {

        // TODO: Phýõng th?c c?ng hai phân s? (this và other), tr? v? ð?i tý?ng Fraction m?i
	int n=this.numerator*other.denominator + this.denominator*other.numerator;
	int m=this.denominator*other.denominator;
	if(m!=0){
	Fraction f1=new Fraction(n,m);
	return f1;
	}
	else
        return null;

    }



    public Fraction subtract(Fraction other) {

        // TODO: Phýõng th?c tr? hai phân s? (this và other), tr? v? ð?i tý?ng Fraction m?i
	int a=this.numerator*other.denominator - this.denominator*other.numerator;
	int b=this.denominator*other.denominator;
	if(b!=0){
	Fraction f2=new Fraction(a,b);
	return f2;
	}
	else
        return null;

    }



    public Fraction multiply(Fraction other) {

        // TODO: Phýõng th?c nhân hai phân s? (this và other), tr? v? ð?i tý?ng Fraction m?i
	int c=this.numerator*other.numerator;
	int d=this.denominator*other.denominator;
	if(d!=0){
	Fraction f3=new Fraction(c,d);
	return f3;
	}
	else
        return null;

    }



    public Fraction divide(Fraction other) {

        // TODO: Phýõng th?c chia hai phân s? (this và other), tr? v? ð?i tý?ng Fraction m?i
	int e=this.numerator*other.denominator ;
	int f=this.denominator*other.numerator;
	if(f!=0){
	Fraction f4=new Fraction(e,f);
	return f4;
	}

        return null;

    }
        public boolean equals(Object obj) {

	Fraction p1= new Fraction(1,1);

        p1= this.subtract((Fraction)obj);

        if(p1.numerator*p1.denominator==0)return true;

        else return false;

    }
	public static void main(String[] args){
	Fraction p2=new Fraction(1,2);
	Fraction p3=new Fraction(3,4);
	p2.add(p3);
	p2.subtract(p3);
	p2.multiply(p3);
	p2.divide(p3);
	if (p2.equals(p3)==true)

            System.out.println("Hai phan so bang nhau");



        else

            System.out.println("Hai phan so khong bang nhau");

}
}