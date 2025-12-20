package practice8.FunctionalInterfaces;

public class Main3 {
    public static void main(String[] args) {
        Predicate isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(9));
        System.out.println(isEven.test(6));
        System.out.println(isEven.test(3));
    }
}
