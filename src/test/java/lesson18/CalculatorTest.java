package lesson18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    private CalculatorHelp calculatorHelp;

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculatorHelp = mock(CalculatorHelp.class);
        calculator = new Calculator(calculatorHelp);
    }
    @Test
    public void shouldSumTwoNumbers() {
        when(calculatorHelp.sumHelper(1,2)).thenReturn(3);

        int actualValue = calculator.sum(1,2);

        assertEquals(3, actualValue);
    }


    @Test
    public void shouldDivideTwoNumbers() {
        int actualValue = calculator.subtract(2,1);

        assertEquals(1, actualValue);
    }

    @Test
    public void shouldDivideTwoNumbers2() {
        int actualValue = calculator.subtract(2,2);

        assertEquals(0, actualValue);
    }

    @Test
    public void shouldDivideTwoNumbers3() {
        int actualValue = calculator.subtract(0,2);

        assertEquals(-2, actualValue);
    }

    @Test
    public void shouldParseInt() {
        int actualValue = calculator.calculate("123");

        assertEquals(123, actualValue);
    }

    @Test
    public void shouldThrowExceptionWhenParseInvalidString() {
        assertThrows(NumberFormatException.class, () -> calculator.calculate("asd"));
    }
}