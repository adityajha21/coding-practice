package org.example.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int num = 6;
        int index = binarySearch(arr, num);
        if(index == -1){
            System.out.println("ELEMENT NOT FOUND!!");
        } else {
            System.out.println("Number found at index: " + index);
        }
    }

    private static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length-1;
        while(start<= end) {
            int mid = (start+end)/2;
            if(num < arr[mid]) {
                end = mid - 1;
            } else if(num > arr[mid]){
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1  ;
    }
}
