// There is an integer array nums sorted in ascending order (with distinct values). 
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
// index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., 
// nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] 
// might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]. 
// Given the array nums after the possible rotation and an integer target, return the 
// index of target if it is in nums, or -1 if it is not in nums.[C] 
// Example 1: 
// Input: nums = [4,5,6,7,0,1,2], target = 0 
// Output: 4 
// Example 2: 
// Input: nums = [4,5,6,7,0,1,2], target = 3 
// Output: -1 

// import java.util.Arrays;

public class C7_p2 {

    public static int search(int[] arr ,int k ,int target){
        
        int n = arr.length;

        int[] temp = new int[n];
        int j = 0;

        for(int i=k ; i<n ; i++){
            temp[j++] = arr[i];
        }
        for(int i=0 ; i<k ; i++){
            temp[j++] = arr[i];
        }  
        

        for(int i=0 ; i<n ; i++){

           if(temp[i] == target){
                return i;
           }
        }

        return -1;
    }
    public static void main(String[] args){

        System.out.println(search(new int[]{1,2,3,4,5,6,7},3,1));

        // 3 -> 0   
        // 4 -> 1
        // 5 -> 2                      
        // 6 -> 3

        // 0 -> 4
        
    }
}
