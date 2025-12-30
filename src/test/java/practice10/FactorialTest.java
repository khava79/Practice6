package practice10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    private final Factorial factorial = new Factorial();
    @ParameterizedTest(name = "Факториал {0} должен быть {1}")
    @CsvSource({
            "0, 1",
            "1, 1",
            "5, 120",
            "7, 5040"
    })
    void testFactorial(int input, int expected) {
        assertEquals(expected, factorial.factorial(input));
    }

    @ParameterizedTest(name = "Факториал от отрицательного числа {0} должен выбрасывать исключение")
    @CsvSource({
            "-1",
            "-5",
            "-7"
    })
    void testNegativeFactorial(String input) {
        int n = Integer.parseInt(input);
        assertThrows(IllegalArgumentException.class,
                () -> factorial.factorial(n));
    }




}
