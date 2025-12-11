package practice6;

import java.util.TreeMap;

public class TreeMapTask2 {
    private TreeMap<Integer, String> key;

    public TreeMapTask2() {
        this.key = new TreeMap<>();
    }

    public void putKeys() {
        key.put(50, "Fifty");
        key.put(89, "Eighty nine");
        key.put(1, "One");
        key.put(12, "Twelve");
    }
    public void findMinAndMax() {
        Integer minKey = key.firstKey();
        Integer maxKey = key.lastKey();

        System.out.println("Минимальный ключ: " + minKey);
        System.out.println("Максимальный ключ: " + maxKey);
    }
}
