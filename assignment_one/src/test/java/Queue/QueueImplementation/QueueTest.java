package Queue.QueueImplementation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    Queue test;

    @Before
    public void setup(){
        test = new Queue(2);
    }

    @Test(expected = Exception.class)
    public void emptyDequeueTest() throws Exception {
        assertTrue(test.empty());
        test.dequeue();
    }

    @Test
    public void enqueueTest() throws Exception {
        test.enqueue(55);
        test.enqueue(35);
        //test.enqueue(1);
        assertEquals(55, test.dequeue());
    }

    @Test(expected = Exception.class)
    public void enqueueSizeFullTest() throws Exception {
        test.enqueue(55);
        test.enqueue(35);
        test.enqueue(1);
    }

}