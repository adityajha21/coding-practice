package leetcode;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {
        public static void main(String[] args) {
            int[] nums = {8, 1, 2, 2, 3};
            System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums))); // Output: [4, 0, 1, 1, 3]
        }

    // Brute forced approach
    // time complexity O(n2) and space complexity O(1)
    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
       // Arrays.sort(nums);

            for(int i =0 ; i<nums.length; i++){
                int count = 0;
                for(int j = 0 ; j<nums.length; j++){
                    if(nums[i] > nums[j]){
                        count++;
                    }
                }
                result[i] = count;
        }

        return result;

    }
}
