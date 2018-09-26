package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(a<0)a=-a;
	if(b<0)b=-b;
	if(a==0 && b!=0)return b;
	if(a!=0 && b==0)return a;
	else{
	while(a!=b){
		if(a>b)a=a-b;
		else b=b-a;
		}
	return a;
	}
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
            if (n==0 || n==1) return n;
        else return Fibonaci(n-1)+Fibonaci(n-2);
        
    }
    public static void main(String[] args) {
        int a=32, b=-6;
        System.out.println(gcd(a,b));
        int n=8;
        System.out.println(Fibonaci(n));
    }
}
