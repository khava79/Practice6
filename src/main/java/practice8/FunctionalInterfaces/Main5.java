package practice8.FunctionalInterfaces;

public class Main5 {
    public static void main(String[] args) {
        Consumer string = s -> System.out.println(s);
        string.accept("Выполнение домашнего задания");
    }
}
