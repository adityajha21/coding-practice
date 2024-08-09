package org.example.arrays;

//Write a code to find the kth smallest/largest element in an unsorted array.

public class SmallestLargestElement {
    public static void main(String[] args) {
        int[] arr = { 7, 21, 3, 1, 50, 6, 11, 8, 9, 10 };
        System.out.println("Start ... ");
        int max = 0,min = 0;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Largest Element : " +max);



    }
}
