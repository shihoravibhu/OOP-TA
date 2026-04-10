// 4. Implement an array with 5 elements in class A. Create four methods for array 
// operation(sortArray(), searchArray(), SumArray(), and avgArray()) and call all the four 
// methods using object.[B]

import java.util.Arrays;

class A {
    int[] arr ;

    public void setter(int[] arr){
        this.arr = arr;
    }

    // Method 1: Sort array
    void sortArray() {

        Arrays.sort(arr);

        System.out.println("Sorted Array : ");
        
        System.out.println(Arrays.toString(arr));
    }

    // Method 2: Search array (search for a value)
    void searchArray(int key) {
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(key + " found in array");
        else
            System.out.println(key + " not found in array");

        System.out.println();
    }

    // Method 3: Sum of array elements
    void sumArray() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum + "\n");
    }

    // Method 4: Average of array elements
    void avgArray() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Average of array: " + (sum / 5.0) + "\n");
    }
}

public class b4 {
    public static void main(String[] args) {
        
        A obj = new A();

        obj.setter(new int[]{5, 2, 9, 1, 7});

        obj.sortArray();
        obj.searchArray(9); // example search
        obj.sumArray();
        obj.avgArray();
    }
}
