package java8;

import java.util.Arrays;

public class SumOfEven {
    //Given an array of integers, write a code to find the sum of all even numbers using Java 8 streams.
    public static void main(String[] args) {
        int[] arr = {2,4,2,1,3,4,5,6};
        int sum = 0 ;
       // sum = Arrays.stream(arr).filter(s->s%2==0).sum();
        sum = Arrays.stream(arr).filter(s -> s%2 ==0).reduce(0, Integer::sum);
        System.out.println(sum);

        // Difference between sum() and reduce ?
        // - sum : Works only with IntStream, LongStream, or DoubleStream.
        // - reduce : Works with any stream, including generic streams.
    }
}
