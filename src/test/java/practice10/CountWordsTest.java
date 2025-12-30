package practice10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest {
    private final CountWords words = new CountWords();

    @ParameterizedTest
    @CsvSource({
            "'Do tasks', 2",
            "'Happy New Year!', 3",
            "'  Phone  is  ringing  ', 4",
            "'Phone is ringing', 3",
            "'', 0"
    })
    void testCountWords(String input, int expected) {
        assertEquals(expected, words.countWords(input));
    }

    @Test
    void testCountWordsWithNull() {
        assertThrows(NullPointerException.class,
                () -> words.countWords(null));

    }


}
