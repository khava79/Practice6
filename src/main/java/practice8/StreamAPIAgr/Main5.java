package practice8.StreamAPIAgr;

import java.util.Arrays;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 3, 87, 44, 9);
        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(hasEven);
    }
}
