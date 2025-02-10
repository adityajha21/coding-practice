package org.example.string;

public class SubSequenceOfString  {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahgc";
        if(isSubSequenceOfString(s,t))
            System.out.println("True");
        else System.out.println("false");
    }

    private static boolean isSubSequenceOfString(String s, String t) {
        int sPointer =0;
        int tPointer =0;
        while(sPointer < s.length() && tPointer < t.length()) {
          if(s.charAt(sPointer) == t.charAt(tPointer)) {
              sPointer++;
          }
          tPointer++;
        }
        return sPointer == s.length();
    }
}
