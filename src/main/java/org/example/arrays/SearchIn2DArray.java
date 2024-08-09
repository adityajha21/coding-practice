package org.example.arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,1},
                {5,90,12,44},
                {23,91,88,74,55}
        };
        int element = 44;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == element)
                    System.out.println("Element found at :" +row +"," +col);
            }

        }
    }
}
