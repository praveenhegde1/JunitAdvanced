package LinkedList.CircularLinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircularLinkedListTest {

    CircularLinkedList test;
    @Before
    public void setup(){
        test = new CircularLinkedList();
        test.pushFront(200);
        test.pushFront(2);
        test.pushBack(5);

    }
    @Test
    public void pushTest(){
        assertEquals(2,test.head.key);
        assertEquals(5,test.head.next.next.key);
    }

    @Test
    public void popFrontTest(){
        test.popFront();
        assertEquals(200,test.head.key);
    }

    @Test
    public void popBackTest(){
        test.popBack();
        assertEquals(2,test.head.key);
    }

}