package TasksTest;

import Tasks.MinMax;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinMaxTest {
    @Test
    public void testCalculateMinMax() {
        MinMax minMax = new MinMax();
        int[] numbers = {3, 4, 5, 2, 1};
        int[] numbers1 = {3, 4, 5, 2, 1};
        ;
        assertArrayEquals(new int[]{1, 5}, minMax.calculateMinMax(numbers, numbers1));
    }


    @Test
    public void testCalculateMinMaxTwo() {
        MinMax minMax = new MinMax();
        int[] numbers = {3, 4, 5, 2, 1};
        int[] numbers1 = {3, 4, 5, 2, 1};
        assertArrayEquals(new int[]{1, 5}, minMax.calculateMinMax(numbers, numbers1));


    }
}