package Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {
    @Test
    public void testThatQueueIsEmpty(){
        MyQueue newQueue = new MyQueue<>();
        assertTrue(newQueue.isEmpty());
    }
    @Test
    public void testQueueSize(){
        MyQueue newQueue = new MyQueue<>();
        assertTrue(newQueue.isEmpty());
        assertEquals(0, newQueue.queueSize());
    }

    @Test
    public void testToAddToTheQueue(){
        MyQueue newQueue = new MyQueue<>();
        assertTrue(newQueue.isEmpty());
        assertEquals(0, newQueue.queueSize());
        newQueue.addQueue(12);
        assertEquals(1, newQueue.queueSize());
    }
    @Test
    public void testToAddToTheQueue_RemoveQueue(){
        MyQueue newQueue = new MyQueue<>();
        assertTrue(newQueue.isEmpty());
        assertEquals(0, newQueue.queueSize());
        newQueue.addQueue(12);
        newQueue.addQueue(10);
        assertEquals(2, newQueue.queueSize());
        newQueue.removeQueue(10);
        assertEquals(1, newQueue.queueSize());
    }


}