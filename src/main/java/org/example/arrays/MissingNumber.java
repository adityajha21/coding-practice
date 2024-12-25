package org.example.arrays;

import java.util.TreeSet;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,10};
        int n=arr.length+1;
        // find sun using sum formula
        int sum=n*(n+1)/2;
        int restSum=0;

        //find sum of given array
        for (int i = 0; i < arr.length; i++) {
            restSum= restSum + arr[i];
        }

        //subtract summation and sum of given array to find missing number
        int missingNumber=sum-restSum;
        System.out.println(missingNumber);
    }
}
