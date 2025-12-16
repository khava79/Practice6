package practice7;

public class Main5 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Привет, мир!");
        System.out.println(stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(45);
        System.out.println(integerBox.getItem());

    }
}
