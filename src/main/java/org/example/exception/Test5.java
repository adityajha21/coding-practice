package org.example.exception;

import java.util.*;
import java.util.stream.Collectors;

public class Test5 {
     static public void main(String[] args) {
     String str ="aditya aditya";
     String str1 = str.replaceAll(" ","");
     String[] strArray = str1.split("");

        List<String> strList =  Arrays.asList(strArray);
        System.out.println(strList.stream().collect(Collectors.groupingBy(s->s,Collectors.counting())));

    }
}
