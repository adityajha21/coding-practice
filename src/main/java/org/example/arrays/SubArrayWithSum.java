package org.example.arrays;

import java.util.Arrays;

public class SubArrayWithSum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,7,5};
        int sum = 12;
        findSubArray(arr, sum);
    }

    private static void findSubArray(int[] arr, int sum) {
    int tempSum = 0;
        for(int i = 0; i<=arr.length ; i++) {
            tempSum = arr[i];
            for(int j = i+1; j<=arr.length; j++) {
                if(tempSum == sum ){
                   System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j)));
                } else if(tempSum > sum || j == arr.length) {
                    break;
                }
                tempSum = tempSum + arr[j];
                System.out.println("Temp Sum : " +tempSum);
            }

        }
    }

}
