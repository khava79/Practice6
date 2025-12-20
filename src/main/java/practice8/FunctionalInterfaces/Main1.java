package practice8.FunctionalInterfaces;

public class Main1 {
    public static void main(String[] args) {
        MathOperations add = (int a, int b) -> a + b;
        MathOperations subtract = (int a, int b) -> a - b;
        MathOperations multiply = (int a, int b) -> a * b;
        MathOperations divide = (int a, int b) -> a / b;


        System.out.println(add.operate(8, 9));
        System.out.println(subtract.operate(10, 2));
        System.out.println(multiply.operate(6, 5));
        System.out.println(divide.operate(30, 2));

    }
}
