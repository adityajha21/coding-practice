package leetcode;

import java.util.Arrays;
// Two Pointer approach
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 7;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if(sum == target) {
                return new int[]{left+1, right+1};  // storing value based, not index based
            } else if(sum > target)  // 6 > 7
                right --;
            else left++;
        }
        return new int[]{-1,-1};
    }



    //Brute force approach
 /*   public static int[] twoSum(int[] nums, int target) {
        int[] finalArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    finalArray[0] = i;
                    finalArray[1] = j;
                }
            } 
        }
        return finalArray;
    }*/
}
