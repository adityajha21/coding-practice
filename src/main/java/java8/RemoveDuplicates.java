package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
       // List<String> list = Arrays.asList("aditya","bittu","aditya");
        List<Integer> list = Arrays.asList(2,3,4,4);
      //  HashSet<String> newList = (HashSet<String>) list.stream().collect(Collectors.toSet());
        List<Integer> newList = list.stream().map(i -> i*i).distinct().toList();
        System.out.println(newList);

    }
}
