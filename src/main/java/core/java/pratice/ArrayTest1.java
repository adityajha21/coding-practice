package core.java.pratice;

import java.util.Arrays;

public class ArrayTest1 {



    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(inPlaceRemove(arr));

    }

    private static int inPlaceRemove(int[] arr) {
        int index = 2;

        for(int i = 2; i < arr.length; i++) {
            if(arr[i] != arr[index]) {
                arr[index] = arr[i];
                index++;
            }

        }
        return index;
    }

}
