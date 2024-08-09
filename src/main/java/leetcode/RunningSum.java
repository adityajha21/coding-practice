package leetcode;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int j =0;
        int[] newArr = new int[arr.length];
        int sum =0;

      /*  for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            newArr[j] = sum;
            j++;
        }*/
        // another approach
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
