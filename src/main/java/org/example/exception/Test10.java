package org.example.exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test10 {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(1,5,2,4,8,6);
        Predicate<Integer> test = (i-> i>36);
        List<Integer> squareArrayList = arrList.stream().map(i -> i*i)
                .filter(test).collect(Collectors.toList());
        System.out.println(squareArrayList);
    }
}
