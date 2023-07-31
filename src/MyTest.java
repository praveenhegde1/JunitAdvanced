package src;

import org.junit.Test;

public class MyTest {

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        int result = 10 / 0; // This will throw an ArithmeticException
    }

    @Test(expected = IllegalArgumentException.class, message = "Invalid input")
    public void testInvalidInput() {
        throw new IllegalArgumentException("Invalid input");
    }

    @Test
    public void testDivision() {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            fail("Expected ArithmeticException was not thrown");
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }

    

}

