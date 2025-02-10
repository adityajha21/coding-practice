package org.example.arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = { 4 , 5 , 2 , 25};
        for (int i = 0; i < arr.length; i++) {
            int nextGreaterElement = -1;  // return -1 if no greater element is found.
            for(int j= i+1 ; j< arr.length; j++) {
                if ( arr[i] < arr[j] ) {
                    nextGreaterElement = arr[j];
                    break;
                }
            }
            System.out.println("Next greatest element for " + arr[i] + " is " + nextGreaterElement);
        }
    }
}
