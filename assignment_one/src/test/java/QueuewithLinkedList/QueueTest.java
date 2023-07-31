package QueuewithLinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class QueueTest {
    Queue test;

    @Before
    public void setup(){
        test = new Queue();
    }

    @Test
    public void dequeueEmpty(){
        assertEquals(-1, test.dequeue());
    }

    @Test
    public void enqueueTest(){
        test.enqueue(25);
        test.enqueue(2);
        test.enqueue(5);

        assertEquals(25, test.dequeue());
        assertEquals(2, test.dequeue());
        assertEquals(5, test.dequeue());


    }

}
