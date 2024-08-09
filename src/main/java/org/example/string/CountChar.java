package org.example.string;

import java.util.Arrays;
import java.util.HashMap;

public class CountChar {
    public static void main(String[] args) {
        String str = "aditya";
       // String[] strArray = str.split("");

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
            System.out.println(
                    str.chars().filter(c-> c == ch).count()
            );
          /*  if(hashMap.containsKey(str.charAt(i)))
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
            else
                hashMap.put(str.charAt(i), 1);*/
        }
        System.out.println(hashMap);
    }
}
