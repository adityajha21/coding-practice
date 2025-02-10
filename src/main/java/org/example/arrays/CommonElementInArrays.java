package org.example.arrays;

import java.util.ArrayList;

public class CommonElementInArrays {
    public static void main(String[] args) {
        // Arrays are sorted here
        int[] arr1 = {1,3,4,7,9};
        int[] arr2 = {1,2,4,5,10};
        int j = 0;
        int i = 0;
        ArrayList<Integer> result = new ArrayList<>();
        //take two pointers
        while( i < arr1.length && j < arr2.length ) {
                if(arr1[i] == arr2[j]) {
                    result.add(arr1[i]);
                    i++;
                    j++;
                } else if(arr1[i] > arr2[j]) {
                    j++;
                } else if(arr1[i] < arr2[j]) {
                    i++;
                }

        }
        System.out.println(result);

    }
}
