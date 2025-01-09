package org.example.string;

import java.util.HashSet;
import java.util.Set;

public class DistinctSubString {
    public static void main(String[] args) {
        String S = "abc";
        Set<String> substrings = new HashSet<>();

        // Generate all substrings
        for (int i = 0; i < S.length(); i++) {
            StringBuilder current = new StringBuilder();
            for (int j = i; j < S.length(); j++) {
                current.append(S.charAt(j));
                substrings.add(current.toString());
            }
        }

        // Include the empty substring
        System.out.println("Size of substrings: " + (substrings.size()+1));
    }
}
