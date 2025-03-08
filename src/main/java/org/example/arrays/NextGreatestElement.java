package org.example.arrays;

import java.util.Arrays;
import java.util.Stack;

// Solve it at O(n)
public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8};
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek()<=arr[i]) {
                stack.pop();
            }
            // Assign next greater element
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        System.out.println("Next Greatest Element: " + Arrays.toString(result));


     // Brute Force
       /* for (int i = 0; i < arr.length; i++) {
            int nextGreaterElement = -1;  // return -1 if no greater element is found.
            for(int j= i+1 ; j< arr.length; j++) {
                if ( arr[i] < arr[j] ) {
                    nextGreaterElement = arr[j];
                    break;
                }
            }
            System.out.println("Next greatest element for " + arr[i] + " is " + nextGreaterElement);
        }*/
    }
}
