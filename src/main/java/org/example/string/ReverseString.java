package org.example.string;

import java.util.Arrays;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {

        //optimized for large array
        String str = "aditya";
        System.out.println("Input String : " +str);
        char[] charArray = str.toCharArray();
        int start =0 ;
        int end = charArray.length-1;
        while(start < end) {
            char temp = charArray[start] ;
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(charArray));

        String reversedString = new String(charArray);
        System.out.println("Reversed String : " +reversedString);

    }
}

    /*    *//*String str = "Aditya Nath Jha" ;
        String rev = "";
        for(int i = str.length()-1; i>0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);*//*
    }
}
*/