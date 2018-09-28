package week2.task3;

public class Task3 {
}
class giao_vien{
    private String name, lop;
    private int tuoi;
    public giao_vien(){}
    public giao_vien(String name, String lop, int tuoi){
        this.name=name;
        this.lop=lop;
        this.tuoi=tuoi;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int gettuoi(){
        return tuoi;
    }
    public void settuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public String getlop(){
        return lop;
    }
    public void setlop(String lop){
        this.lop=lop;
    }
//kien tra hai giao vien co day cung lop khong
    public void check(giao_vien other){
        if(lop.equals(other.getlop())==true) System.out.print("\n cung day mot lop");
        else System.out.print("\n khong day cung lop");
    }
//in thong tin giao vien
    public void print_(){
        System.out.print("\n Thong tin giao vien: \n Ten giao vien :" + name+ "\nTuoi: "+tuoi+"Lop giang day: "+lop);
    }
//so sanh tuoi hai giao vien
    public void sosanhtuoi(giao_vien other){
	if(this.tuoi==other.tuoi)
	System.out.println("\n hai giao vien cung tuoi");
	else
	System.out.println("\n hai giao vien khong cung tuoi");
    }
public static void main(String[] args){
	giao_vien a= new giao_vien();
	a.setname("Thu Huyen");
	a.settuoi(35);
	a.setlop("INT2204");
	a.print_();
	giao_vien b= new giao_vien();
	b.setname("Thanh Thao");
	b.settuoi(35);
	b.setlop("INT2205");
	b.print_();
	a.check(b);
	a.sosanhtuoi(b);
}
}
 // class hinh chu nhat
    class Hinhchunhat {
         private
         int chieudai;
         int chieurong;
         int chuvi;
         int dientich;
         
        public void setChieudai(int chieudai) {
             this.chieudai = chieudai;
         }
	
        public int getChieudai() {
             return chieudai;
         }
 	
        public void setChieurong(int chieurong) {
             this.chieurong = chieurong;
         }
         public int getChieurong() {
             return chieurong;
         }
 	 public void setChuvi(int chuvi) {
             this.chuvi = chuvi;
         }
         public int getChuvi() {
             return chuvi;
         }
 	
         public void setDientich(int dientich) {
             this.dientich = dientich;
         }
         public int getDientich() {
             return dientich;
         }
        
         public Hinhchunhat(int chieudai, int chieurong) {
             this.chieudai = chieudai;
             this.chieurong = chieurong;
         }
 	// kiem tra xem co là hinh vuong khong
        public boolean check() {
             if (chieurong==chieudai) {
                 System.out.println("Hinh can tinh là hinh vuong");
                 return true;
             } else {
                 System.out.println("Hinh can tinh là hinh chu nhat");
                 return false;
             }
         }
         public int tinhP(int chieurong, int chieudai) {// tich chu vi
             return 2 * (chieurong + chieudai);
         }
         public int tinhS(int chieurong, int chieudai) {// tinh dien tich
             return chieudai * chieurong;
         }
         public static void main(String[] args) {
             //Scanner input = new Scanner(System.in);
             Hinhchunhat square = new Hinhchunhat(5, 5);
             square.check();
             /*if (check() == true) {
                 System.out.println("Chu vi c?a hinh vuong là: ");
                 square.tinhP();
                 System.out.println("Dien tich c?a hinh vuong là: ");
                 square.tinhS();
             } else {*/
                 System.out.println("Chu vi c?a hinh chu nhat là: "+
                 2*(square.chieurong+ square.chieudai)+" dõn vi do dai");
                 System.out.println("Dien tich c?a hinh chu nhat là: "+
                 square.tinhS(square.chieurong,square.chieudai)+"don v? dien tich");
             }
         }
 // class dog
 class dog{
    private double cao, nang;
    private String name, chu;
    public dog(){
    }
    public dog(double cao, double nang, String name, String chu){
        this.cao =cao; this.nang=nang; this.name=name; this.chu=chu;
    }
    public double getcao(){
        return cao;
    }
    public double getnang(){
        return nang;
    }
    public String getname(){
        return name;
    }
    public String getchu(){
        return chu;
    }
    public void setcao(double cao){
        this.cao=cao;
    }
    public void setnang(double nang){
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
	//in thong tin cua dog
    public void print_(){
        System.out.println("thong tin :\nTen cho: "+ name+ "\nChu: "+chu+"\nCan nang: "+ nang+"Chieu cao: "+cao);
    }
	//chi so BMI cua dog
    public double BMI(){
        return nang/(cao*cao/10000);
    }
 public static void main(String[] args){
	dog f1=new dog();
	dog f2=new dog();
	f1.setcao(0.4);
	f1.setnang(2.6);
	f1.setname("lili");
	f1.setchu("thanh");
	f1.print_();
	f1.BMI();
	f2.setcao(0.3);
	f2.setnang(2.0);
	f2.setname("mimi");
	f2.setchu("thanh");
	f2.print_();
	f2.BMI();
	f1.samechu(f2);
}
}


//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
