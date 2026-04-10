// 3. Write a program to find maximum no from given 3 no.(without if-else).[A] 

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a :");
        double a = sc.nextDouble();

        System.out.println("enter b :");
        double b = sc.nextDouble();

        System.out.println("enter c :");
        double c = sc.nextDouble();
        
            double ans = Math.max(a, Math.max(b, c));

            System.out.println("largest no : " + ans);

            sc.close() ;
    }
}
