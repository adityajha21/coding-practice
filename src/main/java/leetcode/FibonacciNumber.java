package leetcode;

import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {
        // Formula - f(n) = f(n-1) + f(n-2)
        //Below approach is called memoization map
        // Time complexity is O(n)
        int num = 5;
        if(num <=1) {
            System.out.println(num);
        }
        int[] arr = new int[num+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <=num; i++) {
           arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr));

    }

    }
    //this approach is redundant , hence the time complexity would be n2
   /* private static int fib(int num) {
        if(num <=1)
            return num;
        return fib(num-1)+fib(num-2);
    }*/

    // Efficient approach using Memoization
