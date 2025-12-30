package practice10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberUtilsTest {
    private final NumberUtils numberUtils = new NumberUtils();

    // проверка чётных чисел
    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, -8, -12})
    void testEvenNumbers(int number) {
        assertTrue(numberUtils.isEven(number));
    }

    // проверка нечётных чисел
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -7, -13})
    void testOddNumber(int number) {
        assertFalse(numberUtils.isEven(number));
    }


}
