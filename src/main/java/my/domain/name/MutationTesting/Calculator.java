package my.domain.name.MutationTesting;

public class Calculator {
	
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public boolean isPositive(int number) {
        return number > 0;
    }
    
    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

}
