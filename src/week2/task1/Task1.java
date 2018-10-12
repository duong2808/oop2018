package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        if(a<0)a=-a;
	if(b<0)b=-b;
	if(a==0 && b!=0){
	    System.out.println(b);
	}
	if(a!=0 && b==0){
	    System.out.println(a);
	}
	else{
	   while(a!=b){
		if(a>b){
		a=a-b;
		}
		else{
		b=b-a;
		}
		
		}
	}
        System.out.println(a);
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        return 0;
    }

    public static int fibonacci(int n) {
        if(n==0||n==1){
	    return n;
	}
	if(n>0){
	    return fibonacci(n-1) + fibonacci(n-2);
	}
	else
        return 0;
     }
	public static void main(String[] args){
		gcd(6,8);
		System.out.println(fibonacci(6));
        // TODO: Tìm số fibonacci ở vị trí
    }
}
