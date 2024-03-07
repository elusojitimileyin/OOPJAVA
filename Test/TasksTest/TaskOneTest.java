package TasksTest;

import Tasks.TaskOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {

    @Test
    void testCollectionRateLessThan50(){
        TaskOne myTaskOne = new TaskOne();
        int collectionRate = 40;
        int expected = 40 * 160 + 5000;
        assertEquals(expected, myTaskOne.calculateWages(collectionRate) );

    }
    @Test
    void testCollectionRateLessThan68(){
        TaskOne myTaskOne = new TaskOne();
        int collectionRate = 60;
        int expected = 60 * 250 + 5000;
        assertEquals(expected, myTaskOne.calculateWages(collectionRate) );

    }

}