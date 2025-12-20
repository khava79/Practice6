package practice8.FunctionalInterfaces;

public class Main2 {
    public static void main(String[] args) {
        // анонимный класс
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }

        };
        r1.run();

        // лямбда-выражение
        Runnable r2 = () -> System.out.println("Hello from anonymous class!");
        r2.run();
    }
}
