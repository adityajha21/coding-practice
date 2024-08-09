package org.example.search;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {10,12,15,18,20};
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                System.out.println("Mountain Element:" +arr[i]);
                break;
            }
        }
        System.out.println("Mountain element :" +arr[arr.length-1]);
    }
}
