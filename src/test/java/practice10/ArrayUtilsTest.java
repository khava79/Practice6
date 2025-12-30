package practice10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayUtilsTest {
    private final ArrayUtils arrayUtils = new ArrayUtils();
    static Stream<Arguments> maxCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{4}, 4),
                Arguments.of(new int[]{-7, -4, -2, -1}, -1));
    }



    @ParameterizedTest
    @MethodSource("maxCases")
    void testMaxNumber(int[] input, int expected) {
        assertEquals(expected, arrayUtils.findMax(input));
    }

    @Test
    void testMaxNumberWithEmptyArray() {
        assertThrows(NoSuchElementException.class,
                () -> arrayUtils.findMax(new int[] {}));
    }
}


