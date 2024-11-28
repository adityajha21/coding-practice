package java8;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxMin {
    public static void main(String[] args) {
        //Find the maximum and minimum elements in an array of integers using Java 8 streams.
        int[] arr = {2,1,2,3,45,-1};
        Arrays.stream(arr).min().ifPresent(System.out::println);
       /* OptionalInt min = Arrays.stream(arr).min();
        System.out.println(min.getAsInt());*/

        OptionalInt max = Arrays.stream(arr).max();
        System.out.println(max.getAsInt());
    }
}
