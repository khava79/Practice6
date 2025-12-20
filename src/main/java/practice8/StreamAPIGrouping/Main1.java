package practice8.StreamAPIGrouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Япония", "Россия", "Бразилия", "Марокко", "Мексика", "Румыния", "Беларусь");
        Map<Character, List<String>> groupedByFirstLetter = countries.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(groupedByFirstLetter);
    }
}
