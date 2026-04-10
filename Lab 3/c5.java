// 5. Write  a  program  that  prompts  the  user  to  enter  three  numbers.  Find  the  largest 
// number.[C] 

import java.util.Scanner ; 

public class c5 {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a :");
		double a = sc.nextDouble();

		System.out.println("enter b :");
		double b = sc.nextDouble();

		System.out.println("enter c :");
		double c = sc.nextDouble();

  		double ans = ((a>b)? ((a>c)?(a):(c)) : ((b>c)?(b):(c)));

  			System.out.println("largest no."+ ans);


		sc.close();
	}
}
