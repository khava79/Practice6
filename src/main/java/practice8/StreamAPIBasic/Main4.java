package practice8.StreamAPIBasic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 2, 6);
        List<Integer> newList = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
