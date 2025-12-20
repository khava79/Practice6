package practice8.StreamAPIBasic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(5, 6, 86, 2, 5, 90, 2);
        List<Integer> dub = elements.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(dub);
    }
}
