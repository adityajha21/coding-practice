package java8;

import java.util.Arrays;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,4,89,100,1);
        //list.stream().sorted().forEach(System.out::println);

        int max = list.get(0);
       for (int i = 0; i < list.size(); i++) {
           if(list.get(i) > max) {
               max = list.get(i);
           }
       }
        System.out.println("maximum number in list is: " + max);
    //   System.out.println("Second Highest number in list is" + lis);


    }
}
