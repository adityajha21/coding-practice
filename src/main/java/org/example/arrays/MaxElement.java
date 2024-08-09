package org.example.arrays;

import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,6,12,9};

        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if( arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
