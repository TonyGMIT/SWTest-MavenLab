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


}
