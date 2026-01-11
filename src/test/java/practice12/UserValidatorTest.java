package practice12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {
    private final UserValidator validator = new UserValidator();

    @BeforeEach
    void enableValidation() {
        UserValidator.validationEnable = true;
    }
    @Test
    void testEmptyName() {
        User user = new User("", 34, "klara@gmail.com");
        assertThrows(InvalidUserException.class, () -> validator.validate(user));
    }

    @Test
    void testNameWithLowerCase() {
        User user = new User("jason", 23, "jason@gmail.com");
        assertThrows(InvalidUserException.class, () -> validator.validate(user));
    }

    @Test
    void testInvalidAgeTooYoung() {
        User user = new User("Carmen", 12, "carmen@gmail.com");
        assertThrows(InvalidUserException.class, () -> validator.validate(user));

    }

    @Test
    void testInvalidAgeTooOld() {
        User user = new User("Carmen", 105, "carmen@gmail.com");
        assertThrows(InvalidUserException.class, () -> validator.validate(user));

    }

    @Test
    void testInvalidEmail() {
        User user = new User("Pavel", 34, "pavel-gmail");
        assertThrows(InvalidUserException.class, () -> validator.validate(user));
    }

    @Test
    void testInvalidEmailNull() {
        User user = new User("Pavel", 34, "null");
        assertThrows(InvalidUserException.class, () -> validator.validate(user));
    }
}
