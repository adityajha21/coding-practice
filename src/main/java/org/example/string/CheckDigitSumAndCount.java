package org.example.string;


//Check if Number Has Equal Digit Count and Digit Value
/*Input: num = "1210"
Output: true
Explanation:
num[0] = '1'. The digit 0 occurs once in num.
num[1] = '2'. The digit 1 occurs twice in num.
num[2] = '1'. The digit 2 occurs once in num.
num[3] = '0'. The digit 3 occurs zero times in num.
The condition holds true for every index in "1210", so return true.*/

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class CheckDigitSumAndCount {
    public static void main(String[] args) {
        String num ="1210";
        boolean result = digitCount(num);
        if(result) System.out.println("Count is same");
        else System.out.println("Count is not same");
    }

    private static boolean digitCount(String num) {
       int[] digitCounts = new int[10];
       int count =0;
       //Count occurrences of each digit in the string
        // Step 2: Count occurrences of each digit in the string
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0'; // Convert character to integer
            System.out.println(digit);
            System.out.println(Arrays.toString(digitCounts));
            digitCounts[digit]++;
            System.out.println(Arrays.toString(digitCounts));

        }
        // Step 3: Validate each index in the string
        for (int i = 0; i < num.length(); i++) {
            int expectedCount = num.charAt(i) - '0'; // Expected count from the string
            if (digitCounts[i] != expectedCount) {
                return false; // Mismatch found
            }
        }

        // Step 4: All checks passed
        return true;
    }


}
