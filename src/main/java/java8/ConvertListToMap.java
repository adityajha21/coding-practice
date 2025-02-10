package java8;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,1,6,1,3,1,1,2);
        int count = 0;

        // below code does handle duplicates and a very basic way of converting list to map
      /*  Map<Integer, Integer> employeeMap = list.stream().collect(Collectors.toMap(key -> key , value -> value));
        System.out.println(employeeMap);*/

        //count and number of keys
        HashMap<Integer, Long> resultMap = (HashMap<Integer, Long>) list.stream().collect((Collectors.groupingBy(key -> key , Collectors.counting())));
        System.out.println(resultMap);
    }
}
