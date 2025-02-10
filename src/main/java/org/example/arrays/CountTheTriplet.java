package org.example.arrays;

public class CountTheTriplet {
    public static void main(String[] args) {
        int[] arr = {11, 5, 31, 2,5,5};
         int sum = 10, count = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j=i+1; j<arr.length; j++) {
               sum = arr[i] + arr[j];
               if(searchElement(sum, arr)) {
                   count++;
               }
            }
        }
        System.out.println("Number of Triplet:" +count);
    }

    private static boolean searchElement(int sum, int[] arr) {
        int flag = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == sum) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }
}

