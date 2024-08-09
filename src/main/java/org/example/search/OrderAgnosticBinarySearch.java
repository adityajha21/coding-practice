package org.example.search;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //int[] arr = {5,5,5,5,5,5};
        int[] arr = {2, 34, 56, 77, 89, 90};
        int target = 77;
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                System.out.println(mid);
                break;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
    }
}
