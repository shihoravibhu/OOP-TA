// 4. Write a Java program to copy all the elements of an array to another array and print 
// both the array elements. [B]

public class b4 {
    public static void main(String[] args) {
        
        int[] arr1 = {10, 20, 30, 40, 50};   // original array
        int[] arr2 = new int[arr1.length];   // new array with same size
        
        // Copy elements
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }

        // Print original array
        System.out.print("Original Array: ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        // Print copied array
        System.out.print("\nCopied Array: ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
