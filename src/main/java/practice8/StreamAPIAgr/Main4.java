package practice8.StreamAPIAgr;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Стокгольм", "Москва", "Братислава", "Мадрид", "Баку");
        Optional<String> city = strings.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();
        System.out.println(city);
    }
}
