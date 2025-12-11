package practice6;

import java.util.HashMap;

public class HashMapTask1 {
    private HashMap<String, Integer> nameAge;

    public HashMapTask1() {
        this.nameAge = new HashMap<>();
    }

    public void putNameAge() {
        nameAge.put("Мария", 45);
        nameAge.put("Павел", 33);
        nameAge.put("Ольга", 23);
        nameAge.put("Андрей", 12);
        nameAge.put("Ксения", 44);

    }

    public void printList() {
        for (HashMap.Entry<String, Integer> entry: nameAge.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println("Имя: " + name + ", Возраст: " + age);
        }
    }

}
