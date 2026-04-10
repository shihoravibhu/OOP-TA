import java.util.Arrays;

public class C7_p3 {

    public static int search(int[] arr , int k ,int target){

        int n = arr.length; 

        k = k % n;

        reverse(arr, 0, k-1);
        reverse(arr, k,n-1);
        reverse(arr, 0,n-1);

        System.out.println(Arrays.toString(arr));

        for(int i=0 ; i<n ; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }

    public static void reverse(int[] arr , int start , int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        
        System.out.println(search(new int[]{1,2,3,4,5,6,7},3,1));

    }
}
