package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("ad","bc","aa","gd","lo");
        List<String> sortInAsc = str.stream().sorted().toList();
        List<String> sortInDesc = str.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortInAsc);
        System.out.println(sortInDesc);

        // sort a string alphabetically
        String input = "programming";

        // Split the string into an array of characters, sort, and join
        String sortedString = Arrays.stream(input.split("")) // Split the string into a stream of individual characters
                .sorted()              // Sort the characters alphabetically
                .collect(Collectors.joining()); // Join the sorted characters into a string

        // Print the result
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedString);
    }
}
