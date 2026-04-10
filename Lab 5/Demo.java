import java.util.Scanner;

public class Demo {

    public static void reverse(int arr[] , int start,int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }             

    }
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter k : ");
        int k=sc.nextInt();

        System.out.println("Enter Size Of the Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter Element Of arr["+i+"]");
            arr[i] = sc.nextInt();
        }

        reverse(arr, 0, size-1);
        reverse(arr, 0,k);
        reverse(arr, k+1,size-1);

       
        

        sc.close();
    }
}
