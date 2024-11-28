package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        //Given a list of strings, group them by their lengths using Java 8 streams.
        List<String> strList = Arrays.asList("Adit","deepak", "rashmi");

        Map<Integer, List<String>> resultMap = strList.stream().
                collect(Collectors.groupingBy(String::length));
        System.out.println(resultMap);


    }
}
