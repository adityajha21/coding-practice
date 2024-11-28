package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aditya","bittu","aditya");
      //  HashSet<String> newList = (HashSet<String>) list.stream().collect(Collectors.toSet());
        List<String> newList = list.stream().distinct().toList();
        System.out.println(newList);

    }
}
