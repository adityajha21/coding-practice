package org.example.arrays;

import java.util.TreeSet;

public class MergeTwoArray {
    public static void main(String[] args) {
       int arr1[] = {1,3,5,7};
       int arr2[] = {0,2,6,8,9};
       TreeSet<Integer> treeSet = new TreeSet<>();
       for(int i=0; i< arr1.length;i++) {
           treeSet.add(arr1[i]);
       }
        for(int i=0; i< arr1.length;i++) {
            treeSet.add(arr2[i]);
        }

        treeSet.forEach(s->System.out.println(s));
    }
}
