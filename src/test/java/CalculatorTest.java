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
    void testDivide() {
        assertEquals(10, Calc.divide(100,10));
    }
}
