package week3;

public class Week3 {

    public static int max(int m, int n) {
        if(m>n)return m;
        else if(n>m){
            return n;
            }
        else
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        return -1;
    }

    public static int minOfArray(int[] array){
        
	if(array.length >0 && array.length <100){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
               min=array[i];
                }
            }
        return min;
            }
	else
        return -1;
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        if(weight!=0 && height!=0){
        double BMI=weight/(height*height);
        if(BMI<18.5)return("Thiếu cân");
        if(BMI>=18.5 && BMI<22.9)return("Bình thường");
        if(BMI>=23 && BMI<24.99)return("Thừa cân");
        else return ("Béo phì");
        }
       else // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
    return null;
 }   
}
