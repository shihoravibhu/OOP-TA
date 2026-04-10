// 4.  Write  a  program  to  get  2  numbers  from  the  user  and  print  the  sum  of  two  numbers 
// using command line and Scanner class.[A] 

import java.util.Scanner;

public class a4{
	public static void main(String[] args){
		
		//method 1 using command line 

		// int num1 = Integer.parseInt(args[0]);
		// int num2 = Integer.parseInt(args[1]);

		// int sum = num1 + num2 ;

		// System.out.println(sum);

		Scanner sc = new Scanner(System.in);

		System.out.println("enter num1 : ");
		int num1 = sc.nextInt() ;

		System.out.println("enter num2 : ");
		int num2 = sc.nextInt() ;

		int sum = num1 + num2 ;

		System.out.println(sum);

		sc.close();
	}
}