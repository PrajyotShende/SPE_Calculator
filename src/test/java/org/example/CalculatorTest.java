package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    // Test cases for the factorial method in Main
    @Test
    public void testFactorialPositive() {
        // Factorial of 0 should be 1
        assertEquals(1, Main.factorial(0));
        // Factorial of 5 should be 120
        assertEquals(120, Main.factorial(5));
        assertEquals(5040, Main.factorial(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        // Passing a negative number should throw an IllegalArgumentException
        Main.factorial(-1);
    }

    // Test cases for square root using Math.sqrt
    @Test
    public void testSquareRoot() {
        // Test that square root of 16 is 4
        assertEquals(4.0, Math.sqrt(16.0), 0.0001);
        // Test that square root of 9 is 3
        assertEquals(3.0, Math.sqrt(9.0), 0.0001);
    }

    // Test case for natural logarithm using Math.log
    @Test
    public void testNaturalLog() {
        // The natural logarithm of Math.E should be 1
        assertEquals(1.0, Math.log(Math.E), 0.0001);
    }

    // Test cases for the power function using Math.pow
    @Test
    public void testPowerFunction() {
        // 2 raised to the power 3 should be 8
        assertEquals(8.0, Math.pow(2.0, 3.0), 0.0001);
        // 5 raised to the power 0 should be 1
        assertEquals(1.0, Math.pow(5.0, 0.0), 0.0001);
    }
}
