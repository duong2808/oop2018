package week3;
import week3.Week3.*;

import org.junit.Before;

import org.junit.Test;




import org.junit.Assert;
import static org.junit.Assert.*;

import static week3.Week3.max;
public class Week3Test {
    int min=0;
    int[] array1={3,2,1};
    int[] array2={23,45,13,77,34};
    int[] array3={0,0,1};
    int[] array4={70,43,67,2,7,19,30,1,25,55};
    int[] array5={99,103,63,39,108,202};
@Test    
public void testmax(){
     Assert.assertEquals(2,week3.Week3.max(2,1));
     Assert.assertEquals(-1,week3.Week3.max(1,1));
     Assert.assertEquals(100,week3.Week3.max(100,80));
     Assert.assertEquals(28,week3.Week3.max(8,28));
     Assert.assertEquals(36,week3.Week3.max(32,36));
    }
@Test
public void testminOfArray1(){
    min=week3.Week3.testminOfArray(array1);
    assertEquals(min,1);
}
@Test
public void testminOfArray2(){
    min=week3.Week3.testminOfArray(array2);
    assertEquals(min,13);
}
@Test
public void testminOfArray3(){
    min=week3.Week3.testminOfArray(array3);
    assertEquals(min,0);
}
@Test
public void testminOfArray4(){
    min=week3.Week3.testminOfArray(array4);
    assertEquals(min,1);
}
public void testminOfArray5(){
    min=week3.Week3.testminOfArray(array5);
    assertEquals(min,39);
}
@Test
public void testcalculateBMI(){
    Assert.assertEquals("Thiếu cân",week3.Week3.calculateBMI(46,1.60));
    Assert.assertEquals("Bình thường",week3.Week3.calculateBMI(62,1.70));
    Assert.assertEquals("Thừa cân",week3.Week3.calculateBMI(67,1.67));
    Assert.assertEquals("Béo phì",week3.Week3.calculateBMI(70,1.65));
    Assert.assertEquals("Thiếu cân",week3.Week3.calculateBMI(40.5,1.5));
    
    }
    // TODO: Viết 5 testcase cho phương thức max()

    // TODO: Viết 5 testcase cho phương thức minOfArray()

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
}
