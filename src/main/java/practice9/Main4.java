package practice9;

public class Main4 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread p1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                counter.increment();
        });

        Thread p2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                counter.increment();
        });

        p1.start();
        p2.start();
        p1.join();
        p2.join();

        System.out.println("Итоговый результат: " + counter.getCount());
    }
}
