package my.domain.name.MutationTesting;

public class Calculator {
    
    // Original implementations for reference

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
        } else {
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
    
    
    // Mutated Versions
    
    // Mutant 1: Changed the addition operation.
    // MUTATION: Changed '+' to '-' in add method.
    public int addMutant1(int a, int b) {
        return a - b;
    }
    
    // Mutant 2: Changed the subtraction operation.
    // MUTATION: Changed '-' to '+' in subtract method.
    public int subtractMutant2(int a, int b) {
        return a + b;
    }
    
    // Mutant 3: Altered the isPositive condition.
    // MUTATION: Changed condition from number > 0 to number >= 0.
    public boolean isPositiveMutant3(int number) {
        return number >= 0;
    }
    
    // Mutant 4: Modified the maximum method comparison.
    // MUTATION: Changed the conditional from (a > b) to (a >= b).
    public int maxMutant4(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
    
    // Mutant 5: Incorrect operation in multiplication.
    // MUTATION: Changed '*' to '+' in multiply method.
    public int multiplyMutant5(int a, int b) {
        return a + b;
    }
    
    // Mutant 6: Inappropriate exception trigger in division.
    // MUTATION: Changed condition from (b == 0) to (b < 0).
    public int divideMutant6(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
