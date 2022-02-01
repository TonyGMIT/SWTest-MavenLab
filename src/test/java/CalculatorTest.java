import ie.gmit.week2.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator Calc = new Calculator();

    @Test
    void justAnExample()
    {
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
    void testMultiply() {
        assertEquals(10, Calc.multiply(10,1));
    }

    @Test
    void testDivide() {
        assertEquals(10, Calc.divide(100,10));
    }
}
