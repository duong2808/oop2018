package week3;
import week3.Week3.*;

import org.junit.Before;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
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
     assertEquals(2,Week3.max(2,1));
     assertEquals(-1,Week3.max(1,1));
     assertEquals(100,Week3.max(100,80));
     assertEquals(28,Week3.max(8,28));
     assertEquals(36,Week3.max(32,36));
    }
@Test
public void testminOfArray1(){
    min=Week3.testminOfArray(array1);
    assertEquals(min,1);
}
@Test
public void testminOfArray2(){
    min=Week3.testminOfArray(array2);
    assertEquals(min,13);
}
@Test
public void testminOfArray3(){
    min=Week3.testminOfArray(array3);
    assertEquals(min,0);
}
@Test
public void testminOfArray4(){
    min=Week3.testminOfArray(array4);
    assertEquals(min,1);
}
@Test
public void testminOfArray5(){
    min=week3.Week3.testminOfArray(array5);
    assertEquals(min,39);
}
@Test
public void testcalculateBMI(){
    assertEquals("Thiếu cân",Week3.calculateBMI(46,1.60));
    assertEquals("Bình thường",Week3.calculateBMI(62,1.70));
    assertEquals("Thừa cân",Week3.calculateBMI(67,1.67));
    assertEquals("Béo phì",Week3.calculateBMI(70,1.65));
    assertEquals("Thiếu cân",Week3.calculateBMI(40.5,1.5));
    
    }
    // TODO: Viết 5 testcase cho phương thức max()

    // TODO: Viết 5 testcase cho phương thức minOfArray()

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
}
