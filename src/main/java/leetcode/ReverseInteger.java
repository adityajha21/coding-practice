package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        int input = 123;
        System.out.println(reverseInt(input));
    }

    private static int reverseInt(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Pre-check by dividing back to verify no overflow
            int newReversed = reversed * 10 + digit;
            if ((newReversed - digit) / 10 != reversed) {
                return 0; // Overflow detected
            }

            reversed = newReversed;
        }

        return reversed;
    }
}
