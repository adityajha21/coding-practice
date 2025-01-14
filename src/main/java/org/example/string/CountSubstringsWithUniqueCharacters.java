package org.example.string;

import java.util.HashSet;

//sliding window technique

public class CountSubstringsWithUniqueCharacters {
    public static void main(String[] args) {
        String input = "abca";
        System.out.println(countSubString(input));
    }

    private static int countSubString(String s) {
        int n = s.length();
        int count = 0;
        int left = 0;

        // HashSet to store unique characters in the current window
        HashSet<Character> set = new HashSet<>();

        // Sliding window technique
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            // Remove characters from the left until the current character is unique
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            set.add(currentChar);

            // All substrings from left to right have unique characters
            count += (right - left + 1);
            System.out.println(s.charAt(right) +" " + s.charAt(left));
        }
        System.out.println(set);

        return count;
    }
}
