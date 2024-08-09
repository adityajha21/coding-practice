package org.example.exception;

import java.util.Arrays;
import java.util.List;

public class Test14 {
    public static void main(String[] args) {
        String[] str =  {"eat","tea","tan","ate", "nat","bat"};
        //Output:
        //[["bat"],["nat","tan"],["ate","eat","tea"]]

        Arrays.sort(str);
        for(int i =0; i<str.length; i++) {
            System.out.println(str[i]);
        }

    }
}
