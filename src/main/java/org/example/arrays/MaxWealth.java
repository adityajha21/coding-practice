package org.example.arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,1,6},
                {9,12,5,2,10},
                {10,1,23}
        };
        int minValue = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum +arr[row][col];
            }
            if(sum > minValue)
                minValue = sum;
        }
        System.out.println(minValue);

    }
}
