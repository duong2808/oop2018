package week3;
import org.junit.Test;
import org.junit.Assert;

public class Week3Test {
    int min=0;
    int[] array1={3,2,1};
    int[] array2={23,45,13,77,34};
    int[] array3={0,0,1};
    int[] array4={70,43,67,2,7,19,30,1,25,55};
    int[] array5={99,103,63,39,108,202};
@Test    
public void testmax1(){
     Assert.assertEquals(2,Week3.max(2,1));
}
 @Test    
public void testmax2(){
    Assert.assertEquals(-1,Week3.max(1,1));
}
    @Test    
public void testmax3(){
     Assert.assertEquals(100,Week3.max(100,80));
}
    @Test    
public void testmax4(){
     Assert.assertEquals(28,Week3.max(8,28));
}
    @Test    
public void testmax5(){
     Assert.assertEquals(36,Week3.max(32,36));
    }
@Test
public void testminOfArray1(){
    min=Week3.testminOfArray(array1);
      Assert.assertEquals(min,1);
}
@Test
public void testminOfArray2(){
    min=Week3.testminOfArray(array2);
     Assert.assertEquals(min,13);
}
@Test
public void testminOfArray3(){
    min=Week3.testminOfArray(array3);
     Assert.assertEquals(min,0);
}
@Test
public void testminOfArray4(){
    min=Week3.testminOfArray(array4);
     Assert.assertEquals(min,1);
}
@Test
public void testminOfArray5(){
    min=week3.Week3.testminOfArray(array5);
     Assert.assertEquals(min,39);
}
@Test
public void testcalculateBMI1(){
     Assert.assertEquals("Thiếu cân",Week3.calculateBMI(46,1.60));
}
    @Test
public void testcalculateBMI2(){
     Assert.assertEquals("Bình thường",Week3.calculateBMI(62,1.70));
}
    @Test
public void testcalculateBMI3(){
     Assert.assertEquals("Thừa cân",Week3.calculateBMI(67,1.67));
}
    @Test
public void testcalculateBMI4(){
     Assert.assertEquals("Béo phì",Week3.calculateBMI(70,1.65));
}
    @Test
public void testcalculateBMI5(){
     Assert.assertEquals("Thiếu cân",Week3.calculateBMI(40.5,1.5));
    
    }
    // TODO: Viết 5 testcase cho phương thức max()

    // TODO: Viết 5 testcase cho phương thức minOfArray()

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
}
