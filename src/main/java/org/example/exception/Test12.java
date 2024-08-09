package org.example.exception;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Test12 {
    public static void main(String[] args) {
       // first first repeated character repeated character
        String str = "aditya";
        String[] strArray = str.split("");
        System.out.println(Arrays.toString(strArray));

        List<String> strList = new ArrayList<>();
        for(int i=0; i< strArray.length; i++) {
           strList.add(strArray[i]);
        }
        HashSet<String> set = new HashSet<>();
        System.out.println(
                strList.stream().filter(s -> !set.add(s)).collect(Collectors.toList()).get(0));
    }
}
