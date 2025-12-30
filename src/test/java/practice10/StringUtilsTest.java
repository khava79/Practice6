package practice10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsTest {
    private final StringUtils stringUtils = new StringUtils();

    @ParameterizedTest
    @CsvSource({
            "hello, olleh",
            "Java, avaJ",
            "'', ''",
            "a, a",
            "3456, 6543"
    })
    void testReverseStrings(String input, String expected) {
        assertEquals(expected, stringUtils.reverse(input));
    }

    @Test
    void testReverseWithNull() {
        assertNull(stringUtils.reverse(null));

    }

}
