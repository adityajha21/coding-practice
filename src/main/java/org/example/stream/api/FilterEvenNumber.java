package org.example.stream.api;

import java.util.*;
import java.util.stream.Collectors;

public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,45,10,38,22);


        //sort in ascending order
       List<Integer> sortedArrayList =  list.stream().sorted().collect(Collectors.toList());
        System.out.println("sort array in ascending order");
        System.out.println(sortedArrayList);

        //reverse list
        Collections.reverse(list);
        System.out.println("reverse arraylist");
        System.out.println(list);

        //sort in descending order
        List<Integer> sortArrayListDesc =  list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("sort array in reverse order");
        System.out.println(sortArrayListDesc);

        //filter max and min value
        int num = Collections.max(list);
        System.out.println("Max Element:" +num);

        int maxNum = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max Value using stream API:" +maxNum);


        //filter even number
        List<Integer> evenList = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("Even number in list:");
        System.out.println(evenList);

        //find sum of even number
        Integer evenSum = list.stream().filter(i -> i%2==0).mapToInt(s->s).sum();
        System.out.println("Sum of even number:");
        System.out.println(evenSum);

        //count even number
        System.out.print(list.stream().filter(i -> i%2==0).count());
      System.out.println(" ");
     System.out.print(list.stream().map(i -> i%2==0).count());



    }
}
