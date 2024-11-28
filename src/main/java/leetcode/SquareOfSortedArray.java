package leetcode;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        // Time complexity of below step is O(nlogn)
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
