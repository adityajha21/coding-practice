package org.example.string;

import java.util.HashSet;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "adityaidii";
       HashSet<Character> set = new HashSet<>();
       HashSet<Character> duplicateSet = new HashSet<>();
       for(int i=0; i<str.length(); i++){
           if(set.contains(str.charAt(i))){
               duplicateSet.add(str.charAt(i));
           }
           set.add(str.charAt(i));
       }
        System.out.println(duplicateSet);
    }
}
