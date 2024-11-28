package org.example.string;

public class AddTwoString {
    public static void main(String[] args) {
        String num1 = "1234";
        String num2 = "16";
        StringBuilder result = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while(i>=0 || j>=0 || carry> 0) {
            //convert char to integer
            int digit1;
            int digit2;
            if(i>=0)  digit1 = num1.charAt(i) - '0';
             else  digit1= 0;
            if(j>=0)  digit2 = num2.charAt(j) - '0';
             else digit2 = 0;

             int sum = digit1 + digit2 + carry;
             carry = sum/10;
             result.append(sum%10);
             i--;
             j--;
        }
        System.out.println(result.reverse().toString());
    }
}
