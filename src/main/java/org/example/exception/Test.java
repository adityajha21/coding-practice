package org.example.exception;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] inputMatrix = new int[3][3];
        int[][] outputMatrix =  new int[3][3];
        //o/p:7 4 1
        //8  5 2
        //9 6 3

        //i/p:1 2 3
        //4 5 6
        //7 8 9
        int count = 1;
        for(int row=0; row<3;row++) {
            for(int col=0; col<3; col++) {
                inputMatrix[row][col] = count;
                count++;
            }
        }
        int j=0;
        for(int row=2; row>=0;row--) {
        int i=0;
            for(int col=0; col<=2; col++) {

             outputMatrix[i][j] = inputMatrix[row][col];
             i++;
            }
            j++;
        }

        for(int row=0; row<3;row++) {
            System.out.println();
            for(int col=0; col<3; col++) {
                System.out.print(outputMatrix[row][col]);
            }
        }


    }
}
