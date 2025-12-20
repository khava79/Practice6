package practice8.StreamAPIGrouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 3, 9, 2, 8, 1);
        Map<Boolean, List<Integer>> list = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println(list);
    }
}
