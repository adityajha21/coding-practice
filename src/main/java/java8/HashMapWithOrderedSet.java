package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class HashMapWithOrderedSet {
    public static void main(String[] args) {

        HashMap<String, LinkedHashSet<Integer>> map = new HashMap<>();
        map.put("Aditya" , new LinkedHashSet<>(Arrays.asList(3,2,5,6)));
        map.put("Rashmi", new LinkedHashSet<>(Arrays.asList(1,2,3,4,5)));

        map.get("Aditya").add(10);

        for(Map.Entry<String, LinkedHashSet<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
