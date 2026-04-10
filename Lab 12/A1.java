// 1. Write a program to demonstrate Arithmetic Exception and ArrayIndexOutOfBounds 
// Exception using try-catch block. [A] 

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter total number of students: ");
            int n = sc.nextInt();

            int[] marks = new int[5]; // Fix Size No Array Declare Kriyo

            int total = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks of student " + (i + 1) + ": ");
                marks[i] = sc.nextInt();   // ArrayIndexOutOfBoundsException Avi Sake
                total += marks[i];
            }

            double avg = total / n;   // ArithmeticException Avi Sake
            System.out.println("Average = " + avg);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception: Array limit exceeded");
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred");
        }
        finally {
            sc.close();
        }
       
    }
}
