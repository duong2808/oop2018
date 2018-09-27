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

        // TODO: Tính ý?c chung l?n nh?t c?a 2 s? a, b
	System.out.println(a);
        return 0;

    }



    public static int fibonacci(int n) {

        // TODO: T?m s? fibonacci ? v? trí n
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
	}
}