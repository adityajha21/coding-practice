package org.example.arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        // this is working code in leetcode
        int[] nums1 ={1,2,3,0,0,0};
        int m =3, n=3;
        int p1 = m-1, p2 = n-1;
        int[] nums2 = {2,5,6};
        int i = m+n -1;

        // o/p : [1,2,2,3,5,6]

        while(p2 >= 0 ) {
            if(p1>=0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
