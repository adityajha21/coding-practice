package org.example.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    // two string length and character should be equal
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replace("\\s","").toLowerCase();
        str2 = str2.replace("\\s","").toLowerCase();

        if(str1.length() != str2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if(map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            } else {
                map.put(str1.charAt(i), 1);
            }
        }

        // IF all character count is 1 , then its anagram
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 1) {
                return false;
            }
        }
        return true;





        // below approach time complexity is O(nlog n)
       /* // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to char array and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if sorted arrays are equal
        return Arrays.equals(arr1, arr2);*/
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
