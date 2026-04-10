public class OperatorDemo {
   public static void main(String[] args) {
      int a = 5;  // 0101
      int b = 3;  // 0011
 
      // Arithmetic Operators

      System.out.println("Arithmetic Operators:");
      System.out.println("a + b = " + (a + b));
      System.out.println("a - b = " + (a - b));
      System.out.println("a * b = " + (a * b));
      System.out.println("a / b = " + (a / b));
      System.out.println("a % b = " + (a % b));

      // Relational Operators

      System.out.println("\nRelational Operators:");
      System.out.println("a > b = " + (a > b));
      System.out.println("a < b = " + (a < b));
      System.out.println("a == b = " + (a == b));
      System.out.println("a != b = " + (a != b));
      System.out.println("a >= b = " + (a >= b));
      System.out.println("a <= b = " + (a <= b));

      // logical operator

      //and demo
      int marks = 85;
      int income = 200000;

      if (marks >= 80 && income <= 300000) {
         System.out.println("Eligible for Scholarship");
      } else {
         System.out.println("Not Eligible");
      }

      // // or demo
      if (a > 0 || b < 0) {
         System.out.println("Condition is TRUE");
      } else {
         System.out.println("Condition is FALSE");
      }

      // //not demo
      boolean isFail = false;
      if (!isFail) {
         System.out.println("Student Passed");
      }

      // // Bitwise Operators

      System.out.println("\nBitwise Operators:");
      System.out.println("a & b = " + (a & b));
      System.out.println("a | b = " + (a | b));
      System.out.println("a ^ b = " + (a ^ b));
      System.out.println("a << 1 = " + (a << 1));
      System.out.println("a >> 1 = " + (a >> 1));

      // // Assignment Operators
      System.out.println("\nAssignment Operators:");
      int c = 10;
      c += 5; // c = c + 5
      System.out.println("c += 5 → " + c);
      c -= 3; // c = c - 3
      System.out.println("c -= 3 → " + c);
      c *= 2; // c = c * 2
      System.out.println("c *= 2 → " + c);
      c /= 4; // c = c / 4
      System.out.println("c /= 4 → " + c);
      c %= 3; // c = c % 3
      System.out.println("c %= 3 → " + c);

      System.out.println("++a = " + (a++)); // pre-increment
      System.out.println("b++ = " + (b++)); // post-increment
      System.out.println("--a = " + (--a)); // pre-decrement
      System.out.println("b-- = " + (b--)); // post-decrement

      // Ternary Operator
      System.out.println("\nTernary Operator:");
      int max = (a > b) ? a : b;
      System.out.println("Max of a and b = " + max);
   }
}