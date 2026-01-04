package practice11test;


public class DebugTask6 {
    //Код должен напечатать числа от n до 1, но программа падает с StackOverflowError.
    public static void main(String[] args) {
        countdown(5);
    }
    public static void countdown(int n) {
        if (n >= 1) {
            System.out.println(n);
            countdown(n - 1);
        }
    }
}

