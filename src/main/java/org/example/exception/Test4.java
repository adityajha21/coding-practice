package org.example.exception;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        int[] l1 ={234,345,456,456,567,56856,23};
        int[] l2 = {234,345,7,78,456,335,345,3446};
        Integer[] newArray = new Integer[l1.length+l2.length];

        for(int i = 0; i<l1.length; i++) {
            newArray[i] = l1[i];
        }
        for(int i= l1.length; i<(l1.length +l2.length); i++){
            newArray[i] = l2[l1.length];
        }

        Arrays.sort(newArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(newArray));

    }
}
