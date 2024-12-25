package org.example.miscellenous;

// write table of 4: O/P: 4,8,12,16,18

public class WriteTable {
    public static void main(String[] args) {
        int num = 4;
        for(int i=num ; i<=num*10; i= i+num){
            System.out.println(i);
        }
    }
}
