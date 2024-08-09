package org.example.miscellenous;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 9;
        int flag =1;
            for(int i=2 ; i<num/2; i++) {
                if(num % i ==0){
                    flag =0;
                    break;
                }

        }
            if(flag ==0){
                System.out.println("Number is not prime:" +num);
            } else {
                System.out.println("Number is Prime: " +num);
            }
    }
}
