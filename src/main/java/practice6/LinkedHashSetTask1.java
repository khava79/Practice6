package practice6;

import java.util.LinkedHashSet;

public class LinkedHashSetTask1 {
    private LinkedHashSet<String> elements;

    public LinkedHashSetTask1() {
        this.elements = new LinkedHashSet<>();

    }

    public void addFiveElements() {
        elements.add("Рубашка");
        elements.add("Штаны");
        elements.add("Свитер");
        elements.add("Косынка");
        elements.add("Сумка");
    }

    public void printAllElements() {
        System.out.println("Список элементов: " + elements);
    }
}
