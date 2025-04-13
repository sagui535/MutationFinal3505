package my.domain.name.MutationTesting;

public class Calculator {

    // Mutation: Changed + to -
    public int add(int a, int b) {
        return a - b; // MUTATION
    }

    // Mutation: Changed - to +
    public int subtract(int a, int b) {
        return a + b; // MUTATION
    }

    // Mutation: Changed > to >=
    public boolean isPositive(int number) {
        return number >= 0; // MUTATION
    }

    // Mutation: Changed > to >=
    public int max(int a, int b) {
        if (a >= b) { // MUTATION
            return a;
        } else {
            return b;
        }
    }

    // Mutation: Changed * to +
    public int multiply(int a, int b) {
        return a + b; // MUTATION
    }

    // Mutation: Changed / to *, but kept zero-check
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a * b; // MUTATION
    }
}
