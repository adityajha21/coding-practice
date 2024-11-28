package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        // Array should be not in Non-decreasing order that means
        // array is sorted but has duplicates element
        //like 1,2,2,2,3,4,5,5,5,6

        int[] nums = {1,1,2,2,3,3,4};
        int updateIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[updateIndex] = nums[i];
                updateIndex++;
            }
        }
        for (int i = 0; i < updateIndex; i++) {
            System.out.print(nums[i] + " ");
        }


    }
}
