package org.example.arrays;

import java.util.Arrays;

public class Sort0s1sArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,1,1,1};
        /* Time complexity is O(nlog(n))
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        // Time complexity - O(n)
        int start =0;
        int end = arr.length-1;

        while(start < end) {
            if(arr[start] == 1 &&  arr[end] == 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            if(arr[start] == 0) start++;
            if(arr[end] == 1) end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
