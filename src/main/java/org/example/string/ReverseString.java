package org.example.string;

import java.util.Arrays;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {

        //optimized for large array
        String str = "aditya";
        System.out.println("Input String : " +str);
        String result = getResultViaRecursion(str);
        System.out.println(result);
      /*  char[] charArray = str.toCharArray();
        int startCharacter = 0 ;
        int endCharacter = charArray.length-1;

        while(startCharacter < endCharacter) {
            char temp = charArray[startCharacter] ;
            charArray[startCharacter] = charArray[endCharacter];
            charArray[endCharacter] = temp;

            startCharacter++;
            endCharacter--;
        }
        System.out.println(Arrays.toString(charArray));

        String reversedString = new String(charArray);
        System.out.println("Reversed String : " +reversedString);*/

    }
    // Solve this using loop : Recursion
    private static String getResultViaRecursion(String str) {
        if(str == null || str.length() == 0) return str;
        System.out.println(str.substring(1));
        return getResultViaRecursion(str.substring(1)) + str.charAt(0);
    }
}
