package practice9;

public class Task3 implements Runnable {
    static volatile boolean stop = false;
    @Override
    public void run() {
        int counter = 0;
        while (!stop) {
            counter++;
        } System.out.println("Счетчик: " + counter);

        System.out.println("Рабочий поток остановлен.");
    }
}
