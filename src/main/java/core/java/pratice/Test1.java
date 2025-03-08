package core.java.pratice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) {
        String string ="hello world";
        String reverseString = IntStream.range(0,string.length())
                .mapToObj(i -> string.charAt(string.length()-1 - i)).map(String :: valueOf).collect(Collectors.joining());
        System.out.println(reverseString);
    }
}
