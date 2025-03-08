package core.java.pratice;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayTest {
    public static void main(String[] args) {
       String str = "aditya nath jha";

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2 = list1;
        System.out.println(list2);
        System.out.println(list1);

       /* HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");
        hashMap.forEach((k,v) -> System.out.println( k ," " ,v));*/

       // print first repeated char

        /*str.chars()
                .mapToObj(c -> (char) c)  // Convert int stream to Character stream
                .filter(new HashSet<>()::add) // Filters out repeating characters
                .findFirst().ifPresent(System.out::println); // Gets the first repeating character
*/

        /* str.chars().mapToObj(s -> (char)s)
                .collect(Collectors.groupingBy(s -> s , LinkedHashMap::new,  Collectors.counting()))
                .entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() > 1)
                .map(entry -> entry.getKey() + ":" + entry.getValue()).findFirst().ifPresent(System.out::println);*/
      //  System.out.println(map);


    }
}
