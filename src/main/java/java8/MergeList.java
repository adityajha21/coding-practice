package java8;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
    public static void main(String[] args) {

        // merge list and remove duplicate from the list
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 1, 6, 7, 8};
        /*List<Integer> list1 = Arrays.stream(arr1).boxed().toList();
        List<Integer> list2 = Arrays.stream(arr2).boxed().toList();
      List<Integer> result = Stream.concat(list1.stream(),list2.stream()).distinct().toList();
        System.out.println(result);*/
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> l2 = Arrays.asList(3, 1, 6, 7, 8);
       // List<Integer> result =
                Stream.of(l1,l2).flatMap(List::stream).distinct().toList().forEach(System.out::println);
    }
}
