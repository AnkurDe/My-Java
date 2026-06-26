package com.ankur.Jtest_usage;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest extends TestCase {

    public void testAdd() {
        Calculator calc = new Calculator();

        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    public void testDivide() {
        Calculator calc = new Calculator();

        int result = calc.divide(10, 2);
        assertEquals(5, result);
    }

    public void testDivideByZero() {
        Calculator calc = new Calculator();

        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}