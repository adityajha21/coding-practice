package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,1,4,6,3,7};
        int target = 5;
       int[] indicesArray =  twoSum(nums,target);
       // System.out.println(Arrays.toString(Arrays.stream(indicesArray).toArray()));
        System.out.println(Arrays.toString(indicesArray));
    }
    //Brute force approach
    public static int[] twoSum(int[] nums, int target) {
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
    }
}
