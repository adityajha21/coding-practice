package org.example.exception;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test9 {
    public static void main(String[] args) {
        String str = "aditya";
        char[] ch = str.toCharArray();
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for(int i=0; i<ch.length; i++) {
            if(hashMap.containsKey(ch[i])) {
                hashMap.put(ch[i], hashMap.get(ch[i]) +1);
            } else {
                hashMap.put(ch[i], 1);
            }
        }
        System.out.println(hashMap);

        for(int i=0 ;i<ch.length; i++) {
            if(hashMap.get(ch[i]) ==1) {
                System.out.println(ch[i]);
                break;
            }
         }


    }
}
