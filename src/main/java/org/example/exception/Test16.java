package org.example.exception;

import java.util.*;
import java.util.stream.Collectors;

public class Test16 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,6,6};
            Map<Object, Long> map =  Arrays.stream(arr).mapToObj(s ->s).collect(Collectors.groupingBy(e->e , Collectors.counting()));
        System.out.println(map);
     //   List<Long> uniqueValue = new ArrayList<>();
       map.entrySet().stream().filter(s -> s.getValue() ==1).map(s -> s.getKey()).collect(Collectors.toList()).forEach(System.out::println);


    }


}
