// 3. Write a program to print given array in reverse order.[A]

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[4];

        for (int i = 0; i < a.length; i++) {

            System.out.println("Enter element a" + "[" + i + "] : ");
            a[i] = sc.nextInt();

        }

        System.out.println();

        for (int i = 0; i < a.length/2 ; i++) {
            
            int temp = a[a.length-i-1];
            a[a.length-i-1] = a[i];
            a[i] = temp;         
            
            
        }
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);

        }

        sc.close();

    }
}