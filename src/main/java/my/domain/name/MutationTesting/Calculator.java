package my.domain.name.MutationTesting;

public class Calculator {
    
    public int add(int a, int b) {
        // Mutation: Changed + to -
        return a - b;
    }
    
    public int subtract(int a, int b) {
        // Mutation: Swapped operands
        return b - a;
    }
    
    public boolean isPositive(int number) {
        // Mutation: Changed > to >=
        return number >= 0;
    }
    
    public int max(int a, int b) {
        // Mutation: Changed > to >=
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
    
    public int multiply(int a, int b) {
        // Mutation: Added 1 to result
        return a * b + 1;
    }
    
    public int divide(int a, int b) {
        // Mutation: Changed == 0 to <= 0
        if (b <= 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

}
