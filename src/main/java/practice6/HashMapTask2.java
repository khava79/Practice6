package practice6;

import java.util.HashMap;

public class HashMapTask2 {
    private HashMap<String, Integer> people;

    public HashMapTask2() {
        this.people = new HashMap<>();
    }

    public void putSomeNames() {
        people.put("Lisa", 99);
        people.put("Robert", 45);
        people.put("Pavel", 34);

        for (HashMap.Entry<String, Integer> entry: people.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println("Имя: " + name + ", Возраст: " + age);
        }
    }

    public void checkName(String nameToCheck) {
        if (people.containsKey(nameToCheck)) {
            System.out.println("Имя найдено: " + nameToCheck);
        } else {
            System.out.println("Имя не найдено!");
        }

    }

}
