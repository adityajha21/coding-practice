package org.example.exception;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test15 {
    public static void main(String[] args) {
//list [20,30,50,10,90]
 //       create a list and use stream api to get number more then 65
        List<Integer> list = Arrays.asList(0,30,50,10,90,30,10);

     int[] input =  { 2,1,0,0,1,1};
       // output [0,0,1,1,1,2]
        Arrays.sort(input);


        HashSet<Integer> setTest = new  HashSet<>();
                list.stream().filter(s -> setTest.add(s)).collect(Collectors.toSet());
        System.out.println(setTest);

        for(int i=0; i < list.size(); i++) {
            setTest.add(list.get(i));
        }
        System.out.println(setTest);



        List<Integer> resultList = list.stream().filter(s -> s>65).collect(Collectors.toList());
        System.out.println(resultList);

        //Input: I am giving an interview
        //output : i ma gniving na weivretni
        //output : interview  an giving am  I

        String str = "I am giving an interview";
        String[] strWords = str.split(" ");
        for(int i = strWords.length-1; i>0; i--) {
            System.out.print(strWords[i] +" ");
        }

        for (int i = 0; i < strWords.length ; i++) {
                String word = strWords[i];
                 String revString = "";
            for(int j= word.length()-1; j>=0; j--){
                    revString+=word.charAt(j);
            }
            System.out.print(revString);
        }




    }
}
