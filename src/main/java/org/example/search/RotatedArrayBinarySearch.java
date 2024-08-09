package org.example.search;

public class RotatedArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,11,25,1,2,3,6,9};
        int target = 6;
        System.out.println(search(arr,target));

    }

    public static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        if(pivot == -1)
          return  binarySearch(arr, target , 0 , arr.length-1);

        if(arr[pivot] == target)
           return pivot;

        if(target >= arr[0]) {
           return (binarySearch(arr, target, 0, pivot-1));
        } else {
           return (binarySearch(arr, target, pivot+1 , arr.length-1));
        }
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start+(end-start) / 2;
            if (mid> start && arr[mid - 1] > arr[mid])
                return mid - 1;
            if (end > mid && arr[mid] > arr[mid + 1])
                return mid;
            if(arr[start] >= arr[mid]){
                end = mid -1;
            } else
                start = mid+1;
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid= (start + end)/2;
            if(target > arr[mid])
                start = mid+1;
            else if(target < arr[mid])
                end = mid-1;
            else
                return mid;
        }

        return -1;
    }


}
