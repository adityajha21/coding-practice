package org.example.recursion;


public class Print5Times {

    public static void main(String[] args) {
       /* for (int i = 1; i <= 5; i++) {
            message();
        }*/
        int count =0;
        message(count);

    }
    public static void message(int count) {
        if(count == 5) {
            return;
        }
        System.out.println("Hello World");
        count++;
        message(count);
    }
}
