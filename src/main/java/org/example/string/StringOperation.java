package org.example.string;

import java.util.Locale;

public class StringOperation {
    public static void main(String[] args) {
        String str = "abcede";
        String str1 = str;
        str.trim();
       // str.substring(3, 4);
        str.replace("c","f");
        System.out.println(str1.toUpperCase());
        String txt = "Hello World";
        txt.toUpperCase();
        System.out.println(txt);
    }
}
