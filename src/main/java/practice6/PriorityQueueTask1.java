package practice6;

import java.util.PriorityQueue;

public class PriorityQueueTask1 {
    private PriorityQueue<Integer> number;

    public PriorityQueueTask1() {
        this.number = new PriorityQueue<>();

    }

    public void addNumbers() {
        number.add(98);
        number.add(123);
        number.add(432);
        number.add(745);
        number.add(35);

        System.out.println("Рандомные числа: " + number);
    }

    public void printAllNumbers() {
        System.out.println("Числа перечислены в порядке удаления: ");

        while (!number.isEmpty()) {
            System.out.println(number.poll());
        }
    }
}
