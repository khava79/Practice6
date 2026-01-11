package practice12;

import java.util.regex.Pattern;

public class UserValidator {
    public static boolean validationEnable = true;
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");


    public void validate(User user) {
        if (!validationEnable) return;

        validateName(user.getName());
        validateAge(user.getAge());
        validateEmail(user.getEmail());
    }

    public void validateName (String name) {
        if (name == null || name.isEmpty())
            throw new InvalidUserException("Имя не должно быть пустым.");
        if (!Character.isUpperCase(name.charAt(0)))
            throw new InvalidUserException("Имя должно начинаться с заглавной буквы.");
    }

    public void validateAge (int age) {
        if (age < 18 || age > 100)
            throw new InvalidUserException("Возраст должен быть в пределах от 18 до 100");
    }

    public void validateEmail (String email) {
        if (!EMAIL_PATTERN.matcher(email).matches() || email == null)
            throw new InvalidUserException("Некорректный формат электронной почты.");

    }
}
