package Tasks;

import java.util.Arrays;

public class MinMax {
    public int[] calculateMinMax(int[] numbers, int[] numbers1){
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        return new int[]{ min, max};
    }
}