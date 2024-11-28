package java8;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "ada";
        boolean palindrome = IntStream.range(0,str.length()/2)
                .allMatch(i->str.charAt(i) == str.charAt(str.length() - i - 1));
        if(palindrome)
            System.out.println(str + " is a palindrome");
    }
}
