package practice11test;



public class DebugTask9 {
    //Код должен проверить, равны ли две строки, но почему-то не работает.
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        if (str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
//Почему == не работает:
//new String("hello") создаёт новый объект в памяти каждый раз
//== сравнивает адреса в памяти, а не содержимое строк
//str1 и str2 — разные объекты с разными адресами