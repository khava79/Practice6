package practice8.StreamAPIBasic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Телефон сломался", "Чай заварился", "Наступила ночь");
        List<Integer> lengths = strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(lengths);
    }
}
