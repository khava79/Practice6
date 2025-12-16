package practice7;

public class AgeValidator {
    public static void checkAge(int age) throws CheckedExceptionTask3 {
            if (age < 0 || age > 150) {
                throw new CheckedExceptionTask3("Недопустимый возраст: " + age);
            } else {
                System.out.println("Возраст корректен!");
        }
        }
    }

