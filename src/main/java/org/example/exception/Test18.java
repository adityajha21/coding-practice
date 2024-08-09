package org.example.exception;

public class Test18 {
    public static void main(String[] args) {
        //input: india is my country
        //output : aidnI si ym yrtnuoc
        String input = "india is my country";
        String[] str = input.split(" ");
        for(int i=0 ;i < str.length; i++) {
            System.out.println(revereString(str[i]));
        }
    }

    private static String revereString(String s) {

        char[] c = s.toCharArray();
        int stringLen = c.length;
        int halfLen = stringLen/2;
            for(int i=0; i<halfLen; i++) {
             char ch = c[i];
                c[i] = c[stringLen - 1- i];
                c[stringLen - 1- i] = ch;
            }
        return  new String(c);
    }

   
}
