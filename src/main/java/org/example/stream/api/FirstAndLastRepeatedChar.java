package org.example.stream.api;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstAndLastRepeatedChar {
    public static void main(String[] args) {
        String str ="aditya";

        Map<Character, Long> map =
                str.chars().mapToObj( s -> (char)s)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);

        System.out.println("Find First repeat character");
        System.out.println(
        map.entrySet().stream().filter(s -> s.getValue() >1).map(s-> s.getKey()).findFirst()
        );

        System.out.println("First Non Repeast character");
     Optional<Character> nonRepeatChar = map.entrySet().stream().filter(s -> s.getValue()==1).map(s -> s.getKey()).findFirst();
     if(nonRepeatChar.isPresent())
         System.out.println(nonRepeatChar);
    }
}
