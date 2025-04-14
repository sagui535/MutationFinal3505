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
    
    @Test
    void testAddReturnFirst() {
    	Calculator calculator = new Calculator();
        assertNotEquals(2, calculator.addReturnFirst(2, 3), "Should compute actual sum");
        assertNotEquals(0, calculator.addReturnFirst(0, 5), "Should compute actual sum");
        assertNotEquals(-3, calculator.addReturnFirst(-3, 2), "Should compute actual sum");
        assertEquals(5, calculator.addReturnFirst(2, 3), "2 + 3 should be 5");
    }

    @Test
    void testSubtractInverted() {
    	Calculator calculator = new Calculator();
        assertNotEquals(1, calculator.subtractInverted(5, 4), "Should compute proper subtraction");
        assertNotEquals(-1, calculator.subtractInverted(4, 5), "Should compute proper subtraction");
        assertEquals(1, calculator.subtractInverted(5, 4), "5 - 4 should be 1");
    }

    @Test
    void testIsPositiveAlwaysTrue() {
    	Calculator calculator = new Calculator();
        assertFalse(calculator.isPositiveAlwaysTrue(-1), "Negative should return false");
        assertTrue(calculator.isPositiveAlwaysTrue(1), "Positive should return true");
        assertFalse(calculator.isPositiveAlwaysTrue(0), "Zero should return false");
    }

    @Test
    void testMaxReturnFirst() {
    	Calculator calculator = new Calculator();
        assertNotEquals(3, calculator.maxReturnFirst(3, 5), "Should return maximum value");
        assertNotEquals(3, calculator.maxReturnFirst(3, 1), "Should return maximum value");
        assertEquals(5, calculator.maxReturnFirst(5, 3), "Max(5,3) should be 5");
    }

    @Test
    void testMultiplyByZero() {
    	Calculator calculator = new Calculator();
        assertNotEquals(0, calculator.multiplyByZero(2, 3), "Should compute actual product");
        assertNotEquals(0, calculator.multiplyByZero(0, 5), "Should compute actual product");
        assertEquals(6, calculator.multiplyByZero(2, 3), "2 * 3 should be 6");
    }

    @Test
    void testDivideReturnZero() {
    	Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divideReturnZero(5, 0),
            "Should throw on division by zero");
        assertNotEquals(0, calculator.divideReturnZero(6, 3), "Should compute actual division");
        assertEquals(2, calculator.divideReturnZero(6, 3), "6 / 3 should be 2");
    }

}
