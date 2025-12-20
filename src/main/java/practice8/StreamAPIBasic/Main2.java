package practice8.StreamAPIBasic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 25, 76, 30, 10);
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(filteredNumbers);
    }
}
