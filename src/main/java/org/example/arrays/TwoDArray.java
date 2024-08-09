package org.example.arrays;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] printArray = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        System.out.println(printArray.length);
        for(int row =0; row<printArray.length; row++) {
            System.out.println(Arrays.toString(printArray[row]));
        }

        int[][] arr = new int[4][2];
        for(int row =0; row<3 ; row++) {
            for(int col =0 ; col<2 ;col++ ) {
                arr[row][col] = 5;
            }
        }
        for(int row =0; row<3 ; row++) {
          System.out.println(Arrays.toString(arr[row]));
        }
    }
}
