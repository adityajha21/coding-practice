package leetcode;

import java.util.Arrays;

public class LargestNumber {
    /*Approach
    Convert the integers to strings.
    Sort the strings based on a custom comparator:
    Compare two numbers a and b as strings.
    If concatenating a + b is larger than b + a, then a should come before b.
    Edge case: If the largest number is "0", return "0" (to avoid cases like "00").*/


    public static void main(String[] args) {
        LargestNumber sol = new LargestNumber();
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(sol.largestNumber(nums)); // Output: "9534330"
    }

    private String largestNumber(int[] nums) {
        String[] strArray = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strArray[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strArray, (s1,s2) -> (s2+s1).compareTo(s1 + s2));

        // If the largest number is "0", return "0"
        if (strArray[0].equals("0")) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for (String num : strArray) {
            result.append(num);
        }

        return result.toString();
    }
}
