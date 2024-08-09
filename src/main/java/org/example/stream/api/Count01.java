package org.example.stream.api;

import java.util.Arrays;
import java.util.List;

public class Count01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,0,0,0,1,1,1,1,1,1,1);
        list.stream().filter(s -> s==0).count();
        System.out.println(list.stream().filter(s -> s==0).count());
    }
}
