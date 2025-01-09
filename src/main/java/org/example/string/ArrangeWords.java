package org.example.string;

import java.util.Arrays;
import java.util.Comparator;

public class ArrangeWords {
    public static void main(String[] args) {
        String str = "Leetcode is the best";
        String[] arr = str.split(" ");
        Arrays.sort(arr, Comparator.comparing(String:: length));
        System.out.println(Arrays.asList(arr));

    }
}
