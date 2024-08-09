package org.example.arrays;

public class ArrayRearrange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i=0;
        int j = arr.length-1;
        int n = arr.length;
        System.out.println("Length of array:" +arr.length);
        System.out.println("Last element of array:" +arr[arr.length-1]);
        while(i<j) {
            System.out.print(arr[j--]);
            System.out.print(arr[i++]);
        }
       // find middle index and print middle value at last
        if(n%2 !=0)
            System.out.println(arr[i]);
    }
}

