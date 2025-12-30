package practice10;

import java.util.Arrays;

public class ArrayUtils {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
