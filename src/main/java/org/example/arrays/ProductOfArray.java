package org.example.arrays;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 5, 7 };
        int prod = 1;

        for(int i=0; i<arr.length; i++) {
            prod *= arr[i];
        }
        System.out.println(prod);

        for(int i=0 ;i<arr.length; i++) {
            arr[i] = prod/arr[i];
        }
       System.out.println(Arrays.toString(arr));
    }
}
