// without modulo

import java.util.Scanner ;

public class a2q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int num = sc.nextInt();

        int n = num / 2 ;
        int res = n * 2 ;

        if (num == res) {

        	System.out.println("even");
        	
        }

        else{
        	System.out.println("odd");
        }
        
        
        sc.close();

    }
}
