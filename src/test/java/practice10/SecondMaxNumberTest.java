package practice10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondMaxNumberTest {
    private final SecondMaxNumber secondMaxNumber = new SecondMaxNumber();

    static Stream<Arguments> secondMaxCases(){
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 5),
                Arguments.of(new int[]{4, 9}, 4),
                Arguments.of(new int[]{-7, -4, -2, -1}, -2));

    }

    @ParameterizedTest(name = "Второе максимальное число в массиве {0} должно быть {1}")
    @MethodSource("secondMaxCases")
    void testFindSecondMaxNumber(int[] input, int expected){
        assertEquals(expected, secondMaxNumber.findSecondMax(input));
    }

    @Test
    void testFindSecondMaxNumberDuplicates() {
        int[] array = {9, 9, 9, 9};
        assertThrows(NoSuchElementException.class,
                () -> secondMaxNumber.findSecondMax(array));
    }

    @Test
    void testFindSecondMaxNumberWithSingleElement() {
        int[] array = {55};
        assertThrows(IllegalArgumentException.class,
                () -> secondMaxNumber.findSecondMax(array));
    }

}
