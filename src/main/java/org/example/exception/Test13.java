package org.example.exception;

public class Test13 {
    public static void main(String[] args) {
        //String Reversal in O(n) time
        String str ="december";
        String revStr = "";
        for(int i=str.length()-1; i>=0; i--) {
            revStr+=str.charAt(i);
        }
        System.out.println(revStr);
    }
}
