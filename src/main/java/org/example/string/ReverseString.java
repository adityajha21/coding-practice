package org.example.string;

import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Aditya Nath Jha" ;
        String rev = "";
        for(int i = str.length()-1; i>0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
