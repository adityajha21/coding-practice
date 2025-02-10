package core.java.pratice;

import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pen","Pencil","Pen","Notebook");

        //Remove duplicate elements
        HashSet<String> result = new HashSet<>();
         for(int i =0 ; i< list.size(); i++) {
             result.add(list.get(i));
         }
        System.out.println(result);

        //String starting only from P
        System.out.println("List of String starting only from P");
        list.stream().filter(l ->l.startsWith("P")).collect(Collectors.toList()).forEach(System.out::println);

        //Find frequency of each string
        HashMap<String, Long> resultMap = (HashMap<String, Long>) list.stream().collect(Collectors.groupingBy(l ->l ,Collectors.counting()));
        System.out.println(resultMap);
    }
}