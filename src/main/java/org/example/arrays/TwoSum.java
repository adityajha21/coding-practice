package org.example.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] returnArray = getSum(arr, target);
        System.out.println(Arrays.toString(returnArray));

    }

    private static int[] getSum(int[] arr, int target) {
    int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (target == arr[i] + arr[j]) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}

