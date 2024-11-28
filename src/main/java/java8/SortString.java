package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("ad","bc","aa","gd","lo");
        List<String> sortInAsc = str.stream().sorted().toList();
        List<String> sortInDesc = str.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortInAsc);
        System.out.println(sortInDesc);

    }
}
