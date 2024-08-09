package org.example.exception;

import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        String str = "95adi66tya123nath080";
        String[] words = str.split("[^a-z]");
        System.out.println(Arrays.toString(words));
        String str1 = "";
        for(int i=0; i< words.length; i++) {
           str1+= words[i];
        }
        System.out.println(str1);

        String[] numWord = str.split("[a-z]");
        String str2 = "";
        for(int i=0; i< numWord.length; i++) {
            str2+= numWord[i];
        }
        System.out.println(str2);

    }
}
