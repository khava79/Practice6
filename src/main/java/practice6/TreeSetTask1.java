package practice6;

import java.util.TreeSet;

public class TreeSetTask1 {
    private TreeSet<Integer> numbers;

    public TreeSetTask1() {
        this.numbers = new TreeSet<>();
    }

    public void addFiveNumbers() {
        numbers.add(23);
        numbers.add(64);
        numbers.add(288);
        numbers.add(976);
        numbers.add(7);
        numbers.add(9);
        numbers.add(1);

    }
    public void printList() {
        System.out.println("Список чисел: " + numbers);
    }
}
