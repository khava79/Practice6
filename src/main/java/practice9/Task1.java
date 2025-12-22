package practice9;

public class Task1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Привет из потока!");
        } try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }

    }
}
