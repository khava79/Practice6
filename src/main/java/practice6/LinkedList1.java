package practice6;

import java.util.LinkedList;

public class LinkedList1 {
    private LinkedList<String> list;

    public LinkedList1() {
        this.list = new LinkedList<>();
    }

    public void addFiveStrings() {
        list.add("Телефон");
        list.add("Компьютер");
        list.add("Наушники");
        list.add("Зарядка");
        list.add("Светильник");

    }
    public void printList() {
        System.out.println("Список строк: " + list);
    }
}
