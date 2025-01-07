package java8;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class MaxMin {
    public static void main(String[] args) {
        //Find the maximum and minimum elements in an array of integers using Java 8 streams.
        double[] arr = {2,1,2,3,45,-1};

        // Using min/max method
        Arrays.stream(arr).min().ifPresent(System.out::println);
       /* OptionalInt min = Arrays.stream(arr).min();
        System.out.println(min.getAsInt());*/

        //using reduce method
        Arrays.stream(arr).reduce(Double::max).ifPresent(System.out::println);
    }
}
