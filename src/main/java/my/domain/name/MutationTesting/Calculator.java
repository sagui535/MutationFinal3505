package my.domain.name.MutationTesting;

public class Calculator {
	
    // Mutation: Changed + to -
    public int add(int a, int b) {
        return a - b;  // Original: a + b
    }
    
    // Mutation: Reversed subtraction order
    public int subtract(int a, int b) {
        return b - a;  // Original: a - b
    }
    
    // Mutation: Changed > to >=
    public boolean isPositive(int number) {
        return number >= 0;  // Original: number > 0
    }
    
    // Mutation: Changed > to <
    public int max(int a, int b) {
        if (a < b) {  // Original: a > b
            return a;
        }
        else {
            return b;
        }
    }
    
    // Mutation: Changed * to +
    public int multiply(int a, int b) {
        return a + b;  // Original: a * b
    }
    
    // Mutation: Removed zero check and changed exception type
    public int divide(int a, int b) {
        // Removed: if (b == 0) check
        return a / b;
    }

    // Additional mutated version with different changes
    public int divideV2(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");  // Original: IllegalArgumentException
        }
        return a / b;
    }

    // Mutation: Added offset to max function
    public int maxV2(int a, int b) {
        if (a > b) {
            return a + 1;  // Added +1
        }
        else {
            return b + 1;  // Added +1
        }
    }
}