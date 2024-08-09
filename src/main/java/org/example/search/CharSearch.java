package org.example.search;

public class CharSearch {
    public static void main(String[] args) {
        System.out.println(2%4);

        char[] arr = {'a','b','c','d'};
        char target = 'c';
        for (int i = 0; i < arr.length ; i++) {
            if(target == arr[i])
                System.out.println(i);
        }
    }
}
