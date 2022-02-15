import ie.gmit.week2.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {
    Calculator Calc;

    @BeforeEach
    void justAnExample()
    {
        Calc = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(10, Calc.add(5,5));
    }
    @Test
    void testAddValue() {
        final String message = "Invalid Number";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> Calc.add(1088,9889));
        assertEquals(message,exceptionThrown.getMessage());
    }
    @Test
    void testSubtract() {
        assertEquals(10, Calc.subtract(20,10));
    }
    @Test
    void testSubtractValue() {
        final String message = "Invalid Number";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> Calc.subtract(1000,9999));
        assertEquals(message,exceptionThrown.getMessage());
    }
    @Test
    void testMultiply() {
        assertEquals(10, Calc.multiply(10,1));
    }
    @Test
    void testMultiplyValue() {
        final String message = "Invalid Number";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> Calc.multiply(1001,2002));
        assertEquals(message,exceptionThrown.getMessage());
    }
    @Test
    void testDivide() {
        assertEquals(10, Calc.divide(100,10));
    }
    @Test
    void testDivideValue() {
        final String message = "Invalid Number";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()-> Calc.divide(1099,3002));
        assertEquals(message,exceptionThrown.getMessage());
    }
}
