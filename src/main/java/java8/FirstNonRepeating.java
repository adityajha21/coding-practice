package java8;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "adityyyad";
       /* Map<Character, Long> map = str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

       map.entrySet().stream().filter(e->e.getValue()>1).map(s->s.getKey()).findFirst().ifPresent(System.out::println);
       map.entrySet().stream().filter(e-> e.getValue() ==1).findFirst().ifPresent(System.out::println);*/


        Map<Character,Long> map = str.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity()
        ,Collectors.counting()));
        System.out.println(map);

        Optional<Map.Entry<Character, Long>> c = map.entrySet().stream().filter(m -> m.getValue() >1).skip(1).findFirst();
        if (c.isPresent()) {
            System.out.println("Character found: " + c.get());
        } else {
            System.out.println("No matching character found.");
        }


    }
}
