package org.example.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};


        HashSet<Integer> set =  new HashSet<>();
        HashSet<Integer> commonElementSet = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i]))
                commonElementSet.add(arr2[i]);

        }
     //   System.out.println(commonElementSet);

        //convert set to int[]
        int[] result = new int[commonElementSet.size()];
       int i=0;
       for (int elements : commonElementSet) {
           result[i] = elements;
           i++;
       }
        // else - Set does not provide indexed access, you'll need to convert the Set to a List first
        System.out.println(Arrays.toString(result));
    }
}
