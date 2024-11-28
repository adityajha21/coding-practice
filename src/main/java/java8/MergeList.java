package java8;

import java.util.Arrays;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {

        // merge list and remove duplicate from the list
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 1, 6, 7, 8};
       // List<Integer> list1 = Arrays.asList(arr2);
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        Arrays.stream(arr1).filter(num -> num%2 ==0).forEach(c -> System.out.println(c));
        Arrays.stream(arr1).forEach(System.out::println);
      //  Arrays.stream(arr2).forEach(l -> System.out.println(list1));

         System.arraycopy(arr1, 0, result, 0, arr1.length);
         System.arraycopy(arr2,0,result,arr1.length,arr2.length);
        System.out.println(Arrays.toString(result));
    }
}
