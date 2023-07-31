package ArrayInsert;

import ArrayDeletion.ArrayDeletion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayInsertionTest {

    ArrayInsertion test;
    int [] arr;
    @Before
    public void setup(){
        test = new ArrayInsertion();
        arr = new int[2];
    }
    @Test
    public void insertTest(){
        ArrayInsertion.insert(arr,25,0);
        assertEquals(25,arr[0]);
    }

}