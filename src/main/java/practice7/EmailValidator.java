package practice7;

import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static void checkEmail(String email) {
        try {
            if (!Pattern.matches(EMAIL_REGEX, email)) {
                throw new UncheckedExceptionTask4("Некорректный email: " + email);
            } else {
                System.out.println("Email корректен: " + email);
            }
        } catch (UncheckedExceptionTask4 e) {
            System.out.println(e.getMessage());

        }
    }
}
