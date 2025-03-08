package org.example.arrays;

// Sliding Window
public class MinSizeSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSize(arr,target));
    }

    private static int minSize(int[] nums, int target) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        // Sliding window technique
        for (int right = 0; right < n; right++) {
            sum += nums[right]; // Add the current element to the sum

            // Shrink the window while the sum is greater than or equal to the target
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left]; // Remove the leftmost element from the sum
                left++; // Move the left pointer to shrink the window
            }
        }

        // If no valid subarray was found, return 0
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }



}
