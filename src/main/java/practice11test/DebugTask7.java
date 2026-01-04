package practice11test;



public class DebugTask7 {
    //Два потока списывают деньги со счёта одновременно, но почему-то баланс становится отрицательным.
    private static int balance = 100;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> withdraw(60));
        Thread t2 = new Thread(() -> withdraw(50));
        t1.start();
        t2.start();

        // Ждём завершения потоков
        t1.join();
        t2.join();

    }

    // Добавляем synchronized - теперь только один поток может
    // выполнять этот метод одновременно
    public synchronized static void withdraw(int amount) {
        if (balance >= amount) {
            // ПЕРЕНОСИМ sleep ПОСЛЕ операции или убираем его
            balance -= amount;  // Сначала выполняем операцию
            System.out.println("Снято " + amount + ", новый баланс: " + balance);

            // Если sleep нужен для демонстрации, делаем его ПОСЛЕ операции
            try { Thread.sleep(100); } catch (InterruptedException e) { }
        }
    }
}