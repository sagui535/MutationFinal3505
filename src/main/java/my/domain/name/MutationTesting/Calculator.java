package my.domain.name.MutationTesting;
public class Calculator {
  
   // Mutation: Changed '+' to '-'
   public int add(int a, int b) {
       return a - b;
   }
  
   // Mutation: Changed '-' to '+'
   public int subtract(int a, int b) {
       return a + b;
   }
  
   // Mutation: Changed '>' to '>='
   public boolean isPositive(int number) {
       return number >= 0;
   }
  
   // Mutation: Changed '>' to '<'
   public int max(int a, int b) {
       if (a < b) {
           return a;
       }
       else {
           return b;
       }
   }
  
   // Mutation: Always returns 0
   public int multiply(int a, int b) {
       return 0;
   }
  
   // Mutation: Removed zero-check
   public int divide(int a, int b) {
       return a / b;
   }
   // Additional mutations that weren't in original class
   // but were suggested in the mutations list:
  
   // Mutation: Returns 0 on division by zero
   public int divideSafe(int a, int b) {
       if (b == 0) {
           return 0;
       }
       return a / b;
   }
  
   // Mutation: Changed to check for negativity
   public boolean isNegative(int number) {
       return number < 0;
   }
  
   // Mutation: Always returns first argument
   public int maxAlwaysA(int a, int b) {
       return a;
   }
  
   // Mutation: Added +1 to sum
   public int addPlusOne(int a, int b) {
       return a + b + 1;
   }
}
