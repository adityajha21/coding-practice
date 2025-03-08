package org.example.string;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcb";
        String longestString = "";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLength = 0 , start =0, left =0;

        for(int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            if(map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);

            // update max length and track substring

            if(right - left+1 > maxLength) {
                maxLength = right - left+1;
                start = left; // store start position of the longest substring
            }
        }
        longestString = str.substring(start, start+maxLength);
        System.out.println(longestString);
    }
}
