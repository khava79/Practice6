package practice7;

public class UncheckedExceptionTask2 {
    public static double divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!");
        } return 0;
    }
}
