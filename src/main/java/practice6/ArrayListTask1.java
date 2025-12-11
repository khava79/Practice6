package practice6;

import java.util.ArrayList;

public class ArrayListTask1 {
    private ArrayList<Integer> numbers;

    public ArrayListTask1() {
        this.numbers = new ArrayList<>();
    }

    public void addFiveNumbers() {
        numbers.add(6);
        numbers.add(8);
        numbers.add(34);
        numbers.add(55);
        numbers.add(9);

    }

    public void addLastNumber() {
        numbers.add(123);
        System.out.println("Последнее число: " + numbers);

    }

    public Integer getNumbers(int index) {
        return numbers.get(index);
    }

    public void printList() {
        System.out.println("Список чисел: " + numbers);
    }


}

