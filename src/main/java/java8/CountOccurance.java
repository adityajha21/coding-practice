package java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurance {
    public static void main(String[] args) {

        int[] arr = {3, 3, 1, 3, 2, 1};
/*        String str = "aditya";
        Map<Character,Long> mapResult = str.chars().mapToObj(s->(char)s)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapResult);*/

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxCount =0;
        int mostFrequentItem = 0;
        for (int i =0 ; i<arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i],0 )+1);
        }
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > maxCount ) {
                maxCount = entry.getValue();
                mostFrequentItem = entry.getKey();
            }
        }
        System.out.println(hashMap);
        System.out.println(mostFrequentItem);
    }
// Instead of writing a lambda function like c -> c, which returns the input as-is,
// you can use Function.identity() to achieve the same result in a more concise and expressive way.

}