package practice11test;


public class DebugTask8 {
    //Код должен сравнить два числа, но почему-то результат не соответствует ожиданиям.
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;
        // Округляем до определённого количества знаков
        double roundedA = Math.round(a * 1000000.0) / 1000000.0;
        double roundedB = Math.round(b * 1000000.0) / 1000000.0;

        if (roundedA == roundedB) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
