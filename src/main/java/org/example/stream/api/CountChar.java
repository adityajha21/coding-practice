package org.example.stream.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountChar {
    public static void main(String[] args) {
        String str = "aditya";

        //count vowels
        long noOfVowels = str.chars().filter( (e) -> {
            return (e == 'a') || (e =='d');
        }).distinct().count();

        System.out.println("No of Vowels in String:" +noOfVowels);

        //count specific given character
        System.out.println("Number of character A :"+
                str.chars().filter(s -> s == 'a').count()
        );

        //count each character in string
        Map<Object, Long> map =  str.chars().mapToObj(s-> (char)s).collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(map);


        str.chars().mapToObj(s -> (char)s).collect(Collectors.groupingBy(e->e,Collectors.counting()));

        //Remove duplicate element from string
        String[] strChar = str.split("");
        List<String> arrList = Arrays.asList(strChar);
        System.out.println("Duplicate elements in string");
        arrList.stream().collect(Collectors.toSet()).forEach(System.out::println);

    }
}
