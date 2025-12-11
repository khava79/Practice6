package practice6;

import java.util.LinkedList;

public class LinkedListTask3 {
    private LinkedList<String> listOfNames;

    public LinkedListTask3() {
        this.listOfNames = new LinkedList<>();
    }

    public void addStrings() {
        listOfNames.add("Maria");
        listOfNames.add("Sergei");
        listOfNames.add("Robert");
        listOfNames.add("Max");
        listOfNames.add("Ivan");

    }
    public void printList() {
        System.out.println("Список имен: " + listOfNames);
    }

    public void printFirstAndLast() {
        if (!listOfNames.isEmpty()) {
            System.out.println("Первый элемент: " + listOfNames.getFirst());
            System.out.println("Последний элемент: " + listOfNames.getLast());
        } else {
            System.out.println("Список пуст!");
        }
    }
}
