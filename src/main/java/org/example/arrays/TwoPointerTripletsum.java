package org.example.arrays;

import java.util.Arrays;

public class TwoPointerTripletsum {
    public static void main(String[] args) {
        int[] arr = {1,4,45,6,10,8};
        int target = 22;
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n-2; i++) {
            int left = i+1;
            int right = n-1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println("Triplet found " +arr[i] +"," + arr[left] +"," + arr[right]);
                    return;
                }
                if (sum > target) {
                    right--;
                } else
                    left++;

            }
        }
        System.out.println("Triplet Not found");
        return;


        // Time complexity for the below code is O(N3)
        /*for(int i=0; i<arr.length; i++){
            int firstElement = arr[i];
            for(int j=i+1; j<arr.length; j++){
                int secondElement = arr[j];
                for(int k=j+1; k<arr.length; k++){
                    int thirdElement = arr[k];
                    if(target == (firstElement+secondElement+thirdElement)){
                        System.out.println(firstElement + " " + secondElement + " " + thirdElement);

                    }
                }
            }
        }*/
    }
}
