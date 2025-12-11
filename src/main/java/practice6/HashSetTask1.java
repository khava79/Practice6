package practice6;

import java.util.HashSet;

public class HashSetTask1 {
    private HashSet<Integer> numberSet;

    public HashSetTask1() {
        this.numberSet = new HashSet<>();

    }

    public void addFiveNumbers() {
        numberSet.add(55);
        numberSet.add(74);
        numberSet.add(33);
        numberSet.add(4);
        numberSet.add(4);
        numberSet.add(81);
        numberSet.add(81);
    }

    public void printNumbers() {
        System.out.println("Список чисел: " + numberSet);
    }
}
