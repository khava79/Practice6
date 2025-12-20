package practice8.StreamAPIGrouping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 6, 3, 89, 1);
        double newList = list.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(newList);
    }
}
