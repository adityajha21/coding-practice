package org.example.arrays;

public class EvenNumOfDigit {
    public static void main(String[] args) {
        int[] num = {12, 345, 2, 6, 7896};

        for (int i = 0; i < num.length; i++) {
          /*  int count = 0;
            int temp = num[i];
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }*/
            int n = (int) (Math.log10(num[i]) + 1);
           if(n%2 == 0) {
               System.out.println("Number is Even:" + num[i]);
           }
        }
    }
}
