package practice7;

public class Main7 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Возраст", 25);
        System.out.println(pair.getFirst() + ": " + pair.getSecond());

        pair.setFirst("Обновленный возраст");
        pair.setSecond(89);
        System.out.println(pair.getFirst() + ": " + pair.getSecond());
    }
}
