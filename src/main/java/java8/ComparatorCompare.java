package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class ComparatorCompare {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        //comparable
       List<Integer> result = numbers.stream().sorted().toList();
        System.out.println(result);
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println);

        //comparator
        List<String> names = Arrays.asList("aditya", "jha","rashmi","Dinesh");
        names.stream().map(String :: toUpperCase).sorted().forEach(System.out::println);
      /*  Comparator<Employee> comp = Comparator.comparing(Employee :: getDepartment);
        Collections.sort(list, comp);*/

    }
}
