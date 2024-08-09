package org.example.stream.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayOperation {
    public static void main(String[] args) {
        Integer[] arr = {3,2,5,12,45,10,2,90};

        //Maximun value in an array
        long maxValue = Arrays.stream(arr).max((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(maxValue);

        //avg of integers of array
        Double sum = Arrays.stream(arr).collect(Collectors.averagingInt(Integer :: intValue));
        System.out.println(sum);

        //sum of even numbers
        System.out.println(
                Arrays.stream(arr).filter(i -> i%2 == 0).collect(Collectors.summingInt(Integer :: intValue))
        );

        //find duplicates in array
        List<Integer> arrList = Arrays.asList(arr);
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println("Find duplicates in list");

        HashSet<Integer> resultSet =
                (HashSet<Integer>) arrList.stream().filter(s -> !hashSet.add(s)).collect(Collectors.toSet());
        System.out.println(resultSet);

        //second highest element
        System.out.println("Second highest number");
        Integer num = arrList.stream().sorted().distinct().collect(Collectors.toList()).get(1);
        System.out.println(num);
    }
}
