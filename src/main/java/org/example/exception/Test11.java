package org.example.exception;

import java.io.IOException;
import java.math.BigInteger;

public class Test11 {
        public static final int END = Integer.MAX_VALUE;
    public static final int START = END -100;

    public static void main(String[] args) {
        int count =0;
        for (int i=START; i<=END; i++){
            count++;
            System.out.println(count);
        }
    }
       /*final String pig = "length:10";
       final String dog = "length:" +pig.length();
        System.out.println("Animals are equal :"+pig==dog);*/
}
