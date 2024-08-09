package org.example.string;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Aditya Nath Jha";
        String[] words = str.split(" ");
        System.out.println(Arrays.asList(words));

        for(int i=0; i<words.length; i++) {
            String word = words[i];
            String rev ="";
            for(int j=word.length()-1; j>=0; j--) {
                rev+=word.charAt(j);
            }
            System.out.println(rev);
        }
    }
}
