package week2.task3;


class dog{
    private float cao, nang;
    private String name, chu;
    public dog(){
    }
    public dog(float cao, float nang, String name, String chu){
        this.cao =cao; this.nang=nang; this.name=name; this.chu=chu;
    }
    public float getcao(){
        return cao;
    }
    public float getnang(){
        return nang;
    }
    public String getname(){
        return name;
    }
    public String getchu(){
        return chu;
    }
    public void setcao(float cao){
        this.cao=cao;
    }
    public void setnang(float nang){
        this.nang=nang;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setchu(String chu){
        this.chu= chu;
    }
    public void samechu(dog other){
        if(chu.equals(other.getchu())==true){
            System.out.print("cung chu");
        }
        else {
           System.out.print("khac chu");
        }
    }
    public void print_(){
        System.out.println("thong tin :\nTen cho: "+ name+ "\nChu: "+chu+"\nCan nang: "+ nang+"Chieu cao: "+cao);
    }
    public float BMI(){
        return nang/(cao*cao/10000);
    }
}

public static void mani(String[] args){
	dog f1=new dog(0.4,3.0,aa,thanh);
	dog f2=new dog(0.3,2.3,lili,thanh);
	f1.print_();
	f1.BMI();
	f2.print_();
	f2.BMI();
	f1.samechu(f2);
}
}



public class Task3 {

}


//TODO: khai báo 3 class týõng ?ng v?i 3 ð?i tý?ng th?c t? ? dý?i