package practice10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidatorTest {
    private final EmailValidator emailValidator = new EmailValidator();

    @ParameterizedTest (name = "Корректный email: {0}")
    @ValueSource(strings = {
            "test@example.com",
            "eva_doe@gmail-server.com"
    })
    void testValidEmails(String email) {
        assertTrue(emailValidator.isValidEmail(email));
    }


    @ParameterizedTest (name = "Некорректный email: {0}")
    @ValueSource(strings = {
            "bad@.com",
            "no-at-symbol"
    })
    void testNotValidEmails(String email) {
        assertFalse(emailValidator.isValidEmail(email));
    }


    @Test
    void testNullEmail() {
        assertFalse(emailValidator.isValidEmail(null));
    }

}
