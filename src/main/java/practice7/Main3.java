package practice7;

public class Main3 {
    public static void main(String[] args) {
       try {
           AgeValidator.checkAge(200);
       } catch (CheckedExceptionTask3 e) {
           System.out.println(e.getMessage());
       }
        try {
            AgeValidator.checkAge(12);
        } catch (CheckedExceptionTask3 e) {
            System.out.println(e.getMessage());
        }

    }
}
