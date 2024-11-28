package java8;

import java.util.Arrays;

public class CalculateAverage {
    public static void main(String[] args) {

        double[] arr = {2,1,3};
        double result =0;
        result = Arrays.stream(arr).average().orElse(0.0);
        System.out.println(result);
    }
}