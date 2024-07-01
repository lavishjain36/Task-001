import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    
    CalculatorTest calculator = new Calculator();
    
    @Test
    public void testAdd() {
        assertEquals(4, calculator.add(2, 2), 0);
    }
    
    @Test
    public void testSub() {
        assertEquals(2, calculator.sub(4, 2), 0);
    }
    
    @Test
    public void testMul() {
        assertEquals(6, calculator.mul(2, 3), 0);
    }
    
    @Test
    public void testDiv() {
        assertEquals(2, calculator.div(4, 2), 0);
    }

}
