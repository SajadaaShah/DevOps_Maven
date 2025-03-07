package kaamkaj;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    // Test for addition
    @Test
    public void testAddition() {
        double result = calculator.calculate(5, 3, 1); // 5 + 3
        assertEquals(8.0, result, "Addition result should be 8");
    }

    // Test for subtraction
    @Test
    public void testSubtraction() {
        double result = calculator.calculate(5, 3, 2); // 5 - 3
        assertEquals(2.0, result, "Subtraction result should be 2");
    }

    // Test for multiplication
    @Test
    public void testMultiplication() {
        double result = calculator.calculate(5, 3, 3); // 5 * 3
        assertEquals(15.0, result, "Multiplication result should be 15");
    }

    // Test for division
    @Test
    public void testDivision() {
        double result = calculator.calculate(6, 3, 4); // 6 / 3
        assertEquals(2.0, result, "Division result should be 2");
    }

    // Test for division by zero (should throw exception)
    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.calculate(6, 0, 4); // Trying to divide by 0
        }, "Division by zero should throw ArithmeticException");
    }

    // Test for invalid operation choice
    @Test
    public void testInvalidOperation() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(5, 3, 0); // Invalid choice
        }, "Invalid choice should throw IllegalArgumentException");
    }
}
