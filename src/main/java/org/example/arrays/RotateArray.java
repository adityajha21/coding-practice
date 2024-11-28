package org.example.arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Input Arrays - " + Arrays.toString(arr));
        int k =3;
        // Iterate till kth index
        for(int i=0; i<k; i++) {
            // store first element
            int firstElement = arr[0];
            //keep shifting each element of array till kth index
            for(int j=0; j<arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = firstElement;
        }
        System.out.println(Arrays.toString(arr));
    }
}