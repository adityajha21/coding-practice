package core.java.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IndexOfVowle {
    public static void main(String[] args) {
        String string = "aditya nath jha";
        // i need to return indexes of the vowels
        List<Integer> vowelIndexList = findVowles(string);
        System.out.println(vowelIndexList);

    }

    private static List<Integer> findVowles(String string) {

        String vowles = "aeiouAEIOU";
        return IntStream.range(0, string.length())
                .filter(i -> vowles.indexOf(string.charAt(i)) != -1)
                .boxed()
                .collect(Collectors.toList());



      /*  List<Integer> vowelIndexList = new ArrayList<Integer>();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < string.length(); i++) {
            if(vowels.indexOf(string.charAt(i)) != -1) {
                vowelIndexList.add(i);
            }
        }
        return vowelIndexList;*/
    }
}
