package practice8.StreamAPIAgr;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(56, 78, 1, 43, 99, 390);
        Optional<Integer> maxNumber = list.stream()
                .max(Comparator.naturalOrder());
        int max = maxNumber.orElse(0);
        System.out.println(maxNumber);
    }
}
