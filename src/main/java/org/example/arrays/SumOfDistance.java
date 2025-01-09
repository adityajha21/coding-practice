package org.example.arrays;

import java.util.Arrays;

/*To find the sum of distances between consecutive numbers in a non-repetitive list, we need to first sort
        the list, then calculate the absolute differences
between consecutive numbers, and finally sum them up.*/

public class SumOfDistance {
    public static void main(String[] args) {
        int[] arr = {10,2,7,3,5};
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + (arr[i] - arr[i-1]);
        }
        System.out.println(sum);
    }
}
