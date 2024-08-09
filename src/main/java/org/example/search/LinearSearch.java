package org.example.search;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {3,5,11,21,90,23,11};
        int searchNumber = 121;
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(searchNumber == arr[i]) {
                System.out.println("Element found at index : " +i);
                count++;
            }
        }
        if(count == 0)
            System.out.print("No element found!!!");
        else
            System.out.println("number of times element found: " +count);
    }
}
