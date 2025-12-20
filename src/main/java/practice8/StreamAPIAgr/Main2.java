package practice8.StreamAPIAgr;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 56, 87, 1, 7);
        Optional<Integer> minNumber = list.stream()
                .min(Comparator.naturalOrder());
        int min = minNumber.orElse(0);
        System.out.println(minNumber);
    }
}
