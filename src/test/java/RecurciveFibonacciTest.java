import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class RecurciveFibonacciTest {

    private final RecurciveFibonacci recurciveFibonacci = new RecurciveFibonacci();

    @Test
    public void when_number_is_0_should_return_0() {
        assertEquals(0L, recurciveFibonacci.calculate(0));
    }

    @Test
    public void when_number_is_1_should_return_1() {
        assertEquals(1L, recurciveFibonacci.calculate(1));
    }

    @Test
    public void when_number_is_50_should_return_12586269025() {
        assertEquals(12586269025L, recurciveFibonacci.calculate(50));
    }

    @Test
    public void when_number_is_100_should_return_3736710778780434371() {
        assertEquals(3736710778780434371L, recurciveFibonacci.calculate(100));
    }
}
