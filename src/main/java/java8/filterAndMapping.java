package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterAndMapping {

    //Write a code to filter a list of strings based on a condition and then convert the
    // filtered strings to uppercase using Java 8 streams.
    public static void main(String[] args) {
        List<String> list = Arrays.asList("delhi","mumbai","maithon","dhanbad");
        List<String> filterList = list.stream().filter(x -> x.startsWith("m"))
                .map(String::toUpperCase).toList();
        System.out.println(filterList);

    }

}
