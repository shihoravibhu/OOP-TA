// 2. Write a program to create basic calculator by getting 2 numbers and an operation(+,-
// ,/,*,%) from the user and apply the operation given in a string on the given numbers.[A]

import java.util.Scanner;

public class a2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter add (+), sub (-) , div (/) and mul (*) : ");
		String s = sc.next();

		System.out.println("enter num1 :");
		double a = sc.nextDouble();

		System.out.println("enter num2 :");
		double b = sc.nextDouble();

		// if (s.equals("+")) {

		// 	System.out.println(num1 + num2);

		// }

		// else if (s.equals("-")) {

		// 	System.out.println(num1 - num2);

		// }

		// else if (s.equals("/")) {

		// 	System.out.println(num1 / num2);

		// }

		// else if (s.equals("*")) {

		// 	System.out.println(num1 * num2);

		// }

		// or

		switch (s) {
            case "+":
                System.out.println("Result = " + (a + b));
                break;

            case "-":
                System.out.println("Result = " + (a - b));
                break;

            case "*":
                System.out.println("Result = " + (a * b));
                break;

            case "/":
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero not allowed");
                break;

            case "%":
                System.out.println("Result = " + (a % b));
                break;

            default:
                System.out.println("Invalid Operation");
        }

		sc.close();

	}
}