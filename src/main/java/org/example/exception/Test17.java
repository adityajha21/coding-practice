package org.example.exception;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;

public class Test17 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("abc", 2);
        hashMap.put("xyz", 1);
        hashMap.put("pqr", 3);
        hashMap.put("lmn", 5);
     hashMap.entrySet().stream().sorted(comparingByValue()).forEach(s -> System.out.println(s.getKey() +" : " +s.getValue()));
       }
}
