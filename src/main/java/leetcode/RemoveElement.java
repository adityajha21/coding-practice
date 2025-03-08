package leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr =  {3,2,2,3};
        int arrLength = arr.length-1;
        int value = 3;
       int updatedIndex = 0;

       for(int i=0;i<arrLength;i++) {
           if(arr[i] != value) {
               arr[updatedIndex++] = arr[i];
           }
       }
       for(int i=updatedIndex;i<=arrLength;i++) {
           arr[i] = -1;
       }
        for(int num : arr) {
            System.out.print(num == -1 ? " _ " : num +" ");
        }
    }
}
