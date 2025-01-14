package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,4,89,100,1);

        int max = list.get(0);
       for (int i = 0; i < list.size(); i++) {
           if(list.get(i) > max) {
               max = list.get(i);
           }
       }
        System.out.println("maximum number in list is: " + max);

       //using java 8
       Optional<Integer> secondHighest =  list.stream().distinct().sorted(Comparator.reverseOrder())
               .skip(1).findFirst();
       System.out.println(secondHighest.get());

    }
}
