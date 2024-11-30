package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ConvertListToMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,23,4,5,6,7,8,9);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
      //  list.stream().sorted(Comparator.comparing(s -> s>10)).forEach(System.out::println);
    }
}
