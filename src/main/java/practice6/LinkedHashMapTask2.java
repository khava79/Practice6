package practice6;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapTask2 {
    private LinkedHashMap<String, String> phoneBook;

    public LinkedHashMapTask2() {
        this.phoneBook = new LinkedHashMap<>();
    }

    public void putContacts() {
        phoneBook.put("Bruno", "23-33-55");
        phoneBook.put("Karla", "89-55-39");
        phoneBook.put("Mario", "77-09-83");

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            String phoneNumber = entry.getValue();

            System.out.println("Имя: " + name + ", Номер телефона: " + phoneNumber);
        }


    }

    public void checkContact(String contactToCheck) {
        if (phoneBook.containsKey(contactToCheck)) {
            String phoneNumber = phoneBook.get(contactToCheck);
            System.out.println("Контакт найден: " + contactToCheck + " - " + phoneNumber);
        } else {
            System.out.println("Контакт не найден!");
        }
    }

}
