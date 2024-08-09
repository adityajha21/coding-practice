package org.example.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(1);

        a.add(5);

        a.add(3);

        Collections.sort(a);  // 1,3,5

        a.add(2); // 1,3,5,2

        Collections.reverse(a); //2,5,3,1
        System.out.println("hello World");
    }
}
