package org.example.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*Given an integer array, perform operations by selecting 2 elements from the array, sum them up and
delete those
two elements from the array and add the new sum to the array. Return the final sum.*/
public class FinalSum {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 2};
        System.out.println("Final Sum :" +finalSumOfArray(arr));
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());

    }

    private static Integer finalSumOfArray(int[] arr) {
        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (Integer i : arr) {
            list.add(i);
        }

        while(list.size() > 1) {
            // Sort the list to find the two smallest elements
            Collections.sort(list);

            // Pick the two smallest elements
            int first = list.get(0);
            int second = list.get(1);

            // Sum them and update the list
            list.remove(0); // Remove the first smallest
            list.remove(0); // Remove the second smallest // after removing above, size is reduce, thats why removing first element again
            list.add(first + second); // Add their sum
        }

        // Return the last remaining element in the list
        return list.get(0);
    }

}
