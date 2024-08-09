package org.example.exception;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(12);
        list.add(1);
        list.add(1);
        list.add(12);
        list.add(122);
        list.add(12);

        Set<Integer> duplicate = list.stream().collect(Collectors.toSet());
        System.out.println(duplicate);

    }
}
