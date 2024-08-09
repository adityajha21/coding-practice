package org.example.arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9};
        int[] finalArray = new int[arr1.length + arr1.length -1];

        for(int i=0; i<arr1.length; i++) {
           finalArray[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++) {
            finalArray[arr1.length+ i] = arr2[i];
        }
        System.out.println(Arrays.toString(finalArray));
    }
}
