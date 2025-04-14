package my.domain.name.MutationTesting;

public class Calculator {
    
    // Mutated add: changed + to -
    public int add(int a, int b) {
        return a - b;
    }
    
    // Mutated subtract: changed - to +
    public int subtract(int a, int b) {
        return a + b;
    }
    
    // Mutated isPositive: changed > to >=
    public boolean isPositive(int number) {
        return number >= 0;
    }
    
    // Mutated max: changed > to <
    public int max(int a, int b) {
        if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }
    
    // Mutated multiply: changed * to +
    public int multiply(int a, int b) {
        return a + b;
    }
    
    // Mutated divide: removed zero check
    public int divide(int a, int b) {
        return a / b;
    }

    // Additional mutations that could be interesting to test:
    
    // Always return first operand
    public int addReturnFirst(int a, int b) {
        return a;
    }
    
    // Inverted subtraction
    public int subtractInverted(int a, int b) {
        return b - a;
    }
    
    // Always return true
    public boolean isPositiveAlwaysTrue(int number) {
        return true;
    }
    
    // Max that always returns first value
    public int maxReturnFirst(int a, int b) {
        return a;
    }
    
    // Multiply by zero
    public int multiplyByZero(int a, int b) {
        return 0;
    }
    
    // Divide that returns 0 when dividing by 0
    public int divideReturnZero(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
