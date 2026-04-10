// Write a java program to take user input [A] 
// i. Through Command Line Argument. 
// ii. Through Scanner class. 

// import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {

		// i. Through Command Line Argument.

		int a = Integer.parseInt(args[0]);

		System.out.println(args[0]);
		System.out.println(args[0] + 2);
		System.out.println(a + 2);

		// ii. Through Scanner class.

		// Scanner sc = new Scanner(System.in);

		// // for integer

		// System.out.println("enter integer :");
		// int c = sc.nextInt();

		// System.out.println(c);

		// // for string
		// sc.nextLine();
		// System.out.println("enter string1 :");
		// String a = sc.nextLine();

		// System.out.println("enter string1 :");
		// String b = sc.next();

		// System.out.println(a);
		// System.out.println(b);

		// // for double

		// System.out.println("enter double :");
		// double d = sc.nextDouble();

		// System.out.println(d);

		// sc.close();

	}

}