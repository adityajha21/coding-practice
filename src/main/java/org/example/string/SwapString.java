package org.example.string;

public class SwapString {
    public static void main(String[] args) {
        String str1 = "love";
        String str2 = "you";
        System.out.println("Before Swapping :" +str1 +" " +str2);
        str1 = str1+str2;   //loveyou

        str2 = str1.substring(0, str1.length() - str2.length() );
        str1 = str1.substring(str2.length() , str1.length());
        System.out.println("After Swapping :" +str1 +" " +str2);

    }
}
