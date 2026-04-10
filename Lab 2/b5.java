// 5. Write  a  program  that  reads  a  number  in  meters,  converts  it  to  feet,  and  displays  the 
// result.[B]

import java.util.Scanner;

public class b5{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number in meter : ");
		double num = sc.nextLong();

		double  feet = num * 3.28 ;

		System.out.println(feet);

		sc.close();
	}
}