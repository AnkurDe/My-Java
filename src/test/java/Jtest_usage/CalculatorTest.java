package Jtest_usage;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();

        int result = calc.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();

        int result = calc.divide(10, 2);

        assertEquals(5, result);
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });
    }
}