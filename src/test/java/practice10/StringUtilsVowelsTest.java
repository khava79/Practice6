package practice10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilsVowelsTest {
    private final StringUtilsVowels stringUtilsVowels = new StringUtilsVowels();

    @ParameterizedTest
    @CsvSource({
            "hello, 2",
            "java, 2",
            "AEIOU, 5",
            "'', 0",
            "bgrt, 0"
    })
    void countVowels(String input, int expected) {
        assertEquals(expected, stringUtilsVowels.countVowels(input));
    }
    @Test
    void countVowelsWithNull() {
        assertThrows(IllegalArgumentException.class,
                () -> stringUtilsVowels.countVowels(null));

    }
}
