package practice8.FunctionalInterfaces;

public class Main4 {
    public static void main(String[] args) {
        Function length = s -> s.length();
        System.out.println(length.apply("Hello world!"));
    }
}
