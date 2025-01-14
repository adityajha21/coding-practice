package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,1,6);
        int count = 0;
        Map<Integer, Integer> employeeMap = list.stream().collect(Collectors.toMap(key -> key , value -> value));
        System.out.println(employeeMap);
    }
}
