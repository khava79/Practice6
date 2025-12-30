package practice10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ContactNumbersTest {
    private final ContactNumbers numbers = new ContactNumbers();

    @ParameterizedTest(name = "Корректные номера: {0}")
    @ValueSource(strings = {
            "+1 1234567890",
            "+7 9382999834",
            "+4 9493022349"
    })
    void testValidContactNumbers(String phone) {
        assertTrue(numbers.isValidPhoneNumber(phone));

    }

    @ParameterizedTest(name = "Некорректные номера: {0}")
    @ValueSource(strings = {
            "12345",
            "invalid",
            "982345"
    })

    void testInvalidContactNumbers(String phone) {
        assertFalse(numbers.isValidPhoneNumber(phone));
    }

    @Test
    void testNullContactNumbers() {
        assertThrows(NullPointerException.class,
                () -> numbers.isValidPhoneNumber(null));

    }

}
