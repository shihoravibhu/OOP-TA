// 7. There is an integer array nums sorted in ascending order (with distinct values). 
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

public class c7 {

    public static int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) return mid;

            // If left half [lo..mid] is sorted
            if (nums[lo] <= nums[mid]) {
                // if target is in the left half
                if (nums[lo] <= target && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } 
            // Otherwise right half [mid..hi] must be sorted
            else {
                // if target is in the right half
                if (nums[mid] < target && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        System.out.println("Example 1: index = " + search(nums1, target1)); // expected 4

        // Example 2
        int[] nums2 = {4,5,6,7,0,1,2};
        int target2 = 3;
        System.out.println("Example 2: index = " + search(nums2, target2)); // expected -1

        // You can test more cases:
        // System.out.println(search(new int[]{1}, 1)); // 0
        // System.out.println(search(new int[]{5,1,3}, 5)); // 0
    }
}

