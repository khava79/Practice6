package practice6;

import java.util.HashSet;

public class HashSetTask2 {
    private HashSet<Integer> list;

    public HashSetTask2() {
        this.list = new HashSet<>();
    }

    public void addTenNumbers() {
        list.add(33);
        list.add(1);
        list.add(266);
        list.add(97);
        list.add(58);
        list.add(46);
        list.add(77);
        list.add(29);
        list.add(53);
        list.add(90);

        System.out.println("Список чисел: " + list);

    }
    public void checkNumber(int number) {
        if (list.contains(number)) {
            System.out.println("HashSet содержит число: " + number);
        } else {
            System.out.println("HashSet не содержит данное число: " + number);
        }
    }
}
