package practice10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateUtilsTest {
    private final DateUtils dateUtils = new DateUtils();

    @ParameterizedTest
    @ValueSource(ints = {2000, 2020, 1600, 2044})
    void testLeapYears(int year) {
        assertTrue(dateUtils.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1700, 1900, 2100, 2200})
    void testNotLeapYears(int year) {
        assertFalse(dateUtils.isLeapYear(year));
    }
}
