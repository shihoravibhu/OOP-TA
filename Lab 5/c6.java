// Write an interactive program to print a diamond shape. For example, if user enters 
// the number 5, the shape will be as follows:[C] 
// * * * * * 
// *       * 
// *       * 
// *       * 
// * * * * *

import java.util.Scanner;

public class c6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr numbers : ");
        int num = sc.nextInt();

        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=num ; j++){

                if(i == 1 || i == num || j == 1 || j == num){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        sc.close();
        
    }
}
