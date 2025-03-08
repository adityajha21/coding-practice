package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // Output: true
        System.out.println(isPalindrome("race a car")); // Output: false
        System.out.println(isPalindrome(" ")); // Output: true (empty string is a palindrome)
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            // Skip non-alphanumeric characters
            while(!Character.isLetterOrDigit(s.charAt(left))) left++;
            while(!Character.isLetterOrDigit(s.charAt(right))) right--;

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
