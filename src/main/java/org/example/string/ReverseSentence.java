package org.example.string;

import java.util.Stack;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "aditya nath jha";
        // output - jha nath aditya

        String[] strArray = str.split(" ");
        Stack<String> stack = new Stack<>();

      for(String string : strArray) {
          stack.push(string);
      }
        StringBuilder sb = new StringBuilder();
      while(!stack.isEmpty()) {
          sb.append(stack.pop() +" ");
      }
      System.out.println(sb.toString().trim());

    }
}
