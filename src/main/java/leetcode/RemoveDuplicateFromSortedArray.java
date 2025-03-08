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
                nums[updateIndex++] = nums[i];
            }
        }
        // Replace duplicate and remaining elements with -1
        for(int i = updateIndex; i < nums.length; i++) {
            nums[i] = -1;
        }
        // you can replace -1 to _ also
        for(int num : nums) {
            System.out.print(num == -1 ? "_" +" " : num +" ");
        }
        System.out.println(" ");

  // keep two duplicate
        int[] arr = {1,1,1,2,2,3,3,3,3,4,4,4};
        int index = 2;
        int count = 0;
        for(int i =2; i < arr.length; i++) {
            if(arr[i] != arr[index-2]) {
                arr[index++] = arr[i];
            }
        }

        for(int i = index; i < arr.length; i++) {
            arr[i] = -1;
            count++;
        }
        System.out.println();
        int size = arr.length - count;
        System.out.println("Size of the new Array" +size);
        for(int num : arr) {
            System.out.print(num == -1 ? "_"+" " : num +" ");
        }


    }
}
