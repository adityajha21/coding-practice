package org.example.miscellenous;

public class SmallestDivisorPrime {
    public static void main(String[] args) {
        int ans = isPrime(113);
        System.out.println(ans);
    }

    private static int isPrime(int n) {
        if( n == 2) {
            return 1;
        } else if( n%2 == 0) {
            return 2;
        }
        for(int i = 3; i * i <= n; i =+ 2) {
            if(n%i ==0) {
                return i;
            }
        }
        return 1;

    }

}
