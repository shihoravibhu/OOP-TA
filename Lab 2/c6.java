// 6. Write a program that prompts the user to enter a letter and check whether a letter is a 
// vowel or a constant.[C]

import java.util.Scanner ;

public class c6{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter An Letter : ");
		char ch = sc.next().charAt(0);

		if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') || (ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U')){

			System.out.println("entered latter "+ch+" is vowel");
		}
		
		else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println("eneterd latter "+ch+" is constant");
		}

		else 
		{
			System.out.println("eneterd latter "+ch+" is invalid ");
		}

		sc.close();
	}

}