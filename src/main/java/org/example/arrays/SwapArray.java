package org.example.arrays;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,9,7};
        swap(arr, 2,4);

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp;
        temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
