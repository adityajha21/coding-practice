package org.example.arrays;

//Write a code to find the kth smallest/largest element in an unsorted array.

public class SmallestLargestElement {
    public static void main(String[] args) {
        int[] arr = { 7, 21, 3, 1, 50, 6, 11, 8, 9, 10 };
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Use a standard for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                // Update second largest before updating largest
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                // Update second largest if it's greater than current second largest and not equal to the largest
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest Element : " +secondLargest);



    }
}
