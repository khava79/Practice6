package practice6;

import java.util.ArrayDeque;

public class ArrayDequeTask2 {
    private ArrayDeque<Integer> elements;

    public ArrayDequeTask2() {
        this.elements = new ArrayDeque<>();
    }

    public void pushElements() {
        elements.push(3);
        elements.push(45);
        elements.push(22);
        elements.push(7);
        elements.push(9);

        System.out.println("Текущее состояние стека (сверху вниз): " + elements);
    }

    public void popElements() {
        while (!elements.isEmpty()) {
            Integer number = elements.pop();
            System.out.println("Извлечен элемент: " + number);
        }
        System.out.println("Стек теперь пуст: " + elements.isEmpty());
    }
}
