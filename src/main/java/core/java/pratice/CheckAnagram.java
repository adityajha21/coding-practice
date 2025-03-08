package core.java.pratice;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = checkAnagram(str1, str2);
        if(isAnagram) {
            System.out.println("Given Strings are anagram");
        } else {
            System.out.println("Given Strings are not anagram");
        }
    }

    private static boolean checkAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        return Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());
    }
}
