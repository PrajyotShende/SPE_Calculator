package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testFactorialPositive() {
        assertEquals(1, Main.factorial(0));
        assertEquals(120, Main.factorial(5));
        assertEquals(5040, Main.factorial(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Main.factorial(-1);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Math.sqrt(16.0), 0.0001);
        assertEquals(3.0, Math.sqrt(9.0), 0.0001);
    }

    @Test
    public void testNaturalLog() {
        assertEquals(1.0, Math.log(Math.E), 0.0001);
    }

    @Test
    public void testPowerFunction() {
        assertEquals(8.0, Math.pow(2.0, 3.0), 0.0001);
        assertEquals(1.0, Math.pow(5.0, 0.0), 0.0001);
    }
}
