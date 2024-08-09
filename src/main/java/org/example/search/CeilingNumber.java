package org.example.search;

public class CeilingNumber {
    public static void main(String[] args) {

        int[] arr = {23, 30, 45, 56, 78, 90};
        int target = 57;
        int num;
        num = ceilingNumber(arr, target);
        System.out.println("Number is :" +num);
    }

    private static int ceilingNumber(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        while(start <=end) {
            int mid = (start + end)/2;
          if(target > arr[mid]){
                start = mid +1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
          }
        }
        return arr[start];
    }
}
