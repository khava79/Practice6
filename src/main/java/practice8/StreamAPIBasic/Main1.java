package practice8.StreamAPIBasic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<String> symbols = Arrays.asList("Привет", "Да", "Александра", "Мария");
        List<String> filteredStrings = symbols.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(filteredStrings);
    }
}
