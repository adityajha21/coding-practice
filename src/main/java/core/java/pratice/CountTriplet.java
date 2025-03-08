package core.java.pratice;

import java.util.Arrays;

public class CountTriplet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetSum = 15;
        System.out.println(countTripletSum(arr, targetSum));
    }

    private static int countTripletSum(int[] arr, int targetSum) {
        Arrays.sort(arr);   // n(log n)
        // sorted array - arr = {1,3,4,5,7};
        int arrLen = arr.length;
        int count =0;
        for(int i=0; i<arrLen-2; i++) {
            int left = i +1 ;
            int right = arrLen-1;

            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == targetSum) {
                    count++;
                    left++;
                    right--;
                } else if(sum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }
}
