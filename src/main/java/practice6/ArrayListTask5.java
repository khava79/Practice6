package practice6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask5 {
    private ArrayList<Integer> intNumber;

    public ArrayListTask5() {
        this.intNumber = new ArrayList<>();

    }

    public void addIntNumbers() {
        intNumber.add(98);
        intNumber.add(838);
        intNumber.add(222);

    }
    public void printList() {
        System.out.println("Целые числа: " + intNumber);
    }
    public int findMaxNumber() {
        return Collections.max(intNumber);
    }

    public void printMaxNumber() {
        int max = findMaxNumber();
        System.out.println("Максимальное число: " + max);
    }
}
