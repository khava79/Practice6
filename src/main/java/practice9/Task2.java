package practice9;

public class Task2 {
    public static void main(String[] args) {
        Thread printA = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

        });

        Thread printB = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

        });
        printA.start();
        printB.start();
    }
}