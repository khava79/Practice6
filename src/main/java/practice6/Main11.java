package practice6;

public class Main11 {
    public static void main(String[] args) {
        LinkedHashMapTask2 phoneBook = new LinkedHashMapTask2();

        phoneBook.putContacts();
        phoneBook.checkContact("Elena");
        phoneBook.checkContact("Mario");
    }
}
