package org.example.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String str = "Aditya__Nath$Jha";
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        String result = str.replaceAll("\\s", "");
        System.out.println(result);

        StringBuilder strBuild = new StringBuilder(1);
        char[] ch = result.toCharArray();
        for(int i=1; i<ch.length; i++) {
            if(Character.isUpperCase(ch[i])){
                strBuild.append(" ");
                strBuild.append(ch[i]);

            } else{
                strBuild.append(ch[i]);
            }
        }
        System.out.println(strBuild);

    }
}
