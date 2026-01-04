package practice11;
import java.util.*;


public class DebugTask10 {
    //Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        for (int i = names.size() - 1; i >= 0; i--) {
            if (names.get(i).startsWith("A")) {
                names.remove(i);
            }
        }
        System.out.println(names);
    }
}

