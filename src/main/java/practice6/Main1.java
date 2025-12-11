package practice6;

public class Main1 {
    public static void main(String[] args) {
        ArrayListTask1 list = new ArrayListTask1();

        list.addFiveNumbers();
        list.printList();

        System.out.println("Число по индексу 2: " + list.getNumbers(2));
        list.addLastNumber();
    }
}
