package Array.ArrayDeletion;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class ArrayDeletionTest {
    int[] array;
    int[] newArray;

    void checkEqualArray(int[] expected, int[] actual, int length){
        for(int i = 0; i< length;++i){
            assertEquals(expected[i],actual[i]);
        }
    }

@Before
    public void setup() throws Exception{
    array = new int[]{1, 6, 34, 0, 2, 43};
}

@Test
    public void deleteThridElementTest(){
        int[] expectedArray = new int[]{1, 6, 34, 2, 43,-1};
        newArray = ArrayDeletion.delete(array,3);
        checkEqualArray(expectedArray,newArray, newArray.length);

    }

@Test
    public void InvalidIndex(){
        newArray = ArrayDeletion.delete(array,-1);
        checkEqualArray(array,newArray,array.length);
       // for(int i = 0; i< newArray.length;++i){
       // assertEquals(expectedArray[i],newArray[i]);
       // }
    }

@Test
    public void displayTest(){
    ArrayDeletion.display(array);
    String[] a = new String[0];
    ArrayDeletion.main(a);
}


}