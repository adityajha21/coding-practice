package leetcode;

// using two pointer
public class IsSubsequence {
    public static void main(String[] args) {
        String s1 = "aaaaaa";
        String s2 = "bbaaaa";

        System.out.println(isSubsequence(s1, s2));
    }

    private static boolean isSubsequence(String s1, String s2) {
        if(s1.isEmpty()) return true;
        if(s2.isEmpty()) return false;

        int i = 0, j = 0;
        while(i < s1.length() && j < s2.length()) {
            if(s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else j++;
        }

       return i == s1.length();

    }


    // Brute force
  /*  private static boolean isSubsequence(String s1, String s2) {
        int count = 0;
        for(int i = 0; i < s1.length(); i++) {
            for(int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i) == s2.charAt(j)) {
                    count++;
                }
            }
        }
        if(count == s1.length()) {
            return true;
        } else return false;
    }*/
}
