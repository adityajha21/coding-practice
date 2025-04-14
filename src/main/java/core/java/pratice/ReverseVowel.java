package core.java.pratice;

public class ReverseVowel {
    public static void main(String[] args) {
        String str = "hello";
        char[] charArray = reverseVowel(str);
        String reverseString = new String(charArray);
        System.out.println("Revresed String : " + reverseString);
    }

    private static char[] reverseVowel(String str) {
        char[] chars = str.toCharArray();
        char temp ;
        String volwels = "aeiouAEIOU";;
        int left =0;
        int right = str.length()-1;
        while (left < right) {

            while (left < right && volwels.indexOf(chars[left]) == -1) {
                left++;
            }

            while (left < right && volwels.indexOf(chars[right]) == -1) {
                right--;
            }

            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;


        }
        return chars;
    }

}
