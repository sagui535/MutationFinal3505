package my.domain.name.MutationTesting;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }
    
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
    }
    
    @Test
    public void testIsPositive() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isPositive(10));
        assertFalse(calculator.isPositive(-5));
        assertFalse(calculator.isPositive(0)); // new improvement
    }
    
    @Test
    public void testMax() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.max(5, 3));
        assertEquals(5, calculator.max(3, 5)); 
        assertEquals(5, calculator.max(5, 5));
    }
    
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(5, 0));
    }
    
    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }
    
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(3, calculator.divide(7, 2));
    }

}
