package practice8.StreamAPIAgr;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 4, 76, 823);
        int sumOfAllNumbers = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumOfAllNumbers);
    }
}
