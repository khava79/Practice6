package practice9;

public class Main3 {
    public static void main(String[] args) {
        Thread counter = new Thread((new Task3()));
        counter.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }

        Task3.stop = true;
    }
}
