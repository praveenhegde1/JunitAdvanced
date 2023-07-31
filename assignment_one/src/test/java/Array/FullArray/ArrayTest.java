package Array.FullArray;

import Array.ArrayDeletion.ArrayDeletion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {
    Array testing_arr = new Array();
    int[] array_test;

    @Before
    public void setup() throws Exception{
        array_test = new int[]{1, 5, 34, 0, 8, 43};

       for(int i=0; i<array_test.length ;++i){
           testing_arr.insert(array_test[i],i );
       }
    }

    @Test
    public void deleteElementTest(){
        int[] expectedArray = new int[]{ 0,5,8,34,43};
        testing_arr.delete(10);

        testing_arr.bubbleSort();
        testing_arr.display();
        for(int i=0;i<5;++i){
            assertTrue("Value not found " + expectedArray[i], testing_arr.linearSearch(expectedArray[i]) );
        }
    }
@Test
    public void binarySearch(){
        assertTrue("Value Not Found", testing_arr.binarySearch(43,0,testing_arr.size) );
    }





}