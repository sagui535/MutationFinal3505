package my.domain.name.MutationTesting;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.addMutant1(2, 3));
    }
    
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtractMutant2(3, 2));
    }
    
    @Test
    public void testIsPositive() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isPositiveMutant3(10));
        assertFalse(calculator.isPositiveMutant3(-5));
        assertFalse(calculator.isPositiveMutant3(0)); // new improvement
    }
    
    @Test
    public void testMax() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.maxMutant4(5, 3));
        assertEquals(5, calculator.maxMutant4(3, 5)); 
        assertEquals(5, calculator.maxMutant4(5, 5));
    }
    
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiplyMutant5(2, 3));
        assertEquals(0, calculator.multiplyMutant5(5, 0));
    }
    
    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divideMutant6(5, 0));
    }
    
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divideMutant6(6, 3));
        assertEquals(3, calculator.divideMutant6(7, 2));
    }

}
