package org.example.search;

public class RotatedDuplicateArrayBinarySearch {
    public static void main(String[] args) {
        int arr[] = {3, 3, 3, 1, 2, 3};
        int target = 3;
        System.out.println( findPivot(arr));
       // binarySearch(arr, target, 0, arr.length-1);
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(mid > end && arr[mid] > arr[mid+1])
                return mid;
            if( start > mid && arr[mid-1] > arr[mid])
                return mid-1;
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start +(end-start) /2;
            if(target > arr[mid]) {
                start = mid+1;
            } else if(target < arr[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
