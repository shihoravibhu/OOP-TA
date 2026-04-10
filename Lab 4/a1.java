// 1. The marks obtained by a student in 5 different subjects are input through the 
// keyboard.  
// The student gets a division as per the following rules: 
// I. Percentage above or equals to 60-first division 
// II. Percentage between 50 to 59-second division 
// III. Percentage between 40 and 49-Third division 
// IV. Percentage less than 40-fail 
// Write a program to calculate the division obtained by the student.[A]

import java.util.Scanner ; 
public class a1 {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter subject 1 marks  :");
		double s1 = sc.nextDouble();

		System.out.println("enter subject 2 marks  :");
		double s2 = sc.nextDouble();

		System.out.println("enter subject 3 marks  :");
		double s3 = sc.nextDouble();

		System.out.println("enter subject 4 marks  :");
		double s4 = sc.nextDouble();

		System.out.println("enter subject 5 marks  :");
		double s5 = sc.nextDouble();

		double res = (s1+s2+s3+s4+s5)/5.0;

		if(res<40){

			System.out.println("4th division");
		}

		else if(res>=40 && res<50){

			System.out.println("3rd division");
		}

		else if(res>=50 && res<60){

			System.out.println("2nd division");
		}

		else if(res>=60){

			System.out.println("1st division");
			
		}
		sc.close();
	}
}
