package org.example.search;

public class InfiniteArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,130,140,160,170};
        System.out.println(ans(arr, 10));
    }
    private static int ans(int[] arr, int target) {
        int start =0;
        int end =1;

        while(target > arr[end]){
            //temp start
           /*  int temp  = end+1;
             end = end +(end-start+1)*2;
             if(end > arr.length-1) {
                 end = arr.length-1;
             }
             start= temp;*/
             start = end+1;
             if(end > arr.length-1) {
                 end = end *2;
             } else {
                 end = arr.length-1;
             }

        }
        return binarySearch(arr, start, end, target);

    }
    private static int binarySearch(int[] arr, int start, int end, int num) {

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
