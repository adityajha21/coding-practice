package org.example.string;

import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "adityaidii";

        //using java 8
        HashSet<Character> set = new HashSet<>();
        str.chars().mapToObj(c -> (char)c) // convert Int stream to char
                .filter(c -> !set.add((char) c))
                .forEach(System.out::println);


       /*HashSet<Character> set = new HashSet<>();
       HashSet<Character> duplicateSet = new HashSet<>();
       for(int i=0; i<str.length(); i++){
           if(set.contains(str.charAt(i))){
               duplicateSet.add(str.charAt(i));
           }
           set.add(str.charAt(i));
       }
        System.out.println("Duplicates : " +duplicateSet);
        System.out.println("Unique character" +set);*/
    }
}
