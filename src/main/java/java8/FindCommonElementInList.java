package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindCommonElementInList {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4);
        List<Integer> l2 = Arrays.asList(1,7,5,4);

        List<Integer> result1 = l1.stream().filter(element -> l2.contains(element)).toList();
        System.out.println(result1);
       /* List<Integer> result2 = l2.stream().filter(element -> !l1.contains(element)).toList();
        Stream.of(result1,result2).flatMap(List:: stream).forEach(System.out::println);*/
    }
}
