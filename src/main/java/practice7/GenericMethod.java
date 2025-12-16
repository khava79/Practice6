package practice7;

public class GenericMethod {
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

}
