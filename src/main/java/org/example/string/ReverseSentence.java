package org.example.string;

import java.util.Stack;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "aditya nath jha";
        // output - jha nath aditya

        String[] strArray = str.split(" ");
        Stack<String> stack = new Stack<>();

        for(int i=0; i<strArray.length; i++) {
            stack.push(strArray[i]);
        }

        for(int i =0 ; i<=stack.size(); i++) {
            System.out.print(stack.pop() +" ");
        }


       /* for(int i = strArray.length - 1; i >= 0; i--) {
            stack.push(strArray[i]);
        }
        System.out.println(stack);*/
    }
}
