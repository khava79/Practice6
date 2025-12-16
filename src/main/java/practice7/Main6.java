package practice7;

public class Main6 {
    public static void main(String[] args) {
        GenericMethod array = new GenericMethod();
        Integer[] intArray = {1,2,3,4,5,6,7};
        String[] stringArray = {"A","B","C","D","E"};

        array.printArray(intArray);
        array.printArray(stringArray);

    }
}
