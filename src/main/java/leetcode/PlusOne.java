package leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        for (int i = digits.length-1 ; i>=0 ; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                System.out.println(Arrays.toString(digits));
                return;
            }
        }
        System.out.println(Arrays.toString(digits));
        digits = new int[digits.length +1];
        digits[0] = 1 ;
        System.out.println(Arrays.toString(digits));
    }
}
