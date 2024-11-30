package java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class CalculateAverage {
    public static void main(String[] args) {

        double[] arr = {2,1,3};
        OptionalDouble result = Arrays.stream(arr).average();
        System.out.println(result.getAsDouble());

        List<Integer> list = Arrays.asList(1,3,2);
       OptionalDouble res =  list.stream().mapToDouble(i -> i).average();
        if(res.isPresent()){
            System.out.println(res.getAsDouble());
        }

    }
}