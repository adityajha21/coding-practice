package core.java.pratice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,1,4,5,10,10);

        int secondHighestNumber =  numbers.stream().distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighestNumber);
    }
}
