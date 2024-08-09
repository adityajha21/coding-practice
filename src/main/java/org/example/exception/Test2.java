package org.example.exception;

import java.util.*;
import java.util.stream.Collectors;


public class Test2 {
    public static void main(String[] args) {
        Integer[] i = {2, 1, 4, 61, 2, 5};
        //sort Array in ASC order
        Arrays.sort(i, Collections.reverseOrder());
        System.out.println(Arrays.toString(i));

        Employe[] e = {  new Employe(3, 400, "Aditya"),
                new Employe(1, 300, "Nath"),
                new Employe(2, 500, "Jha")};

        //do Operation for array
        // print array
        System.out.println("Printing Array: " + Arrays.toString(e));

        // sort Array based on salary
        Arrays.sort(e, new SortBySalary());
        System.out.println(Arrays.toString(e));

        //Do operation on List now
        List<Employe> empList = Arrays.asList(e);

        List<Employe> eStream = empList
                                .stream()
                                .sorted(Comparator.comparing(Employe::getSalary)
                                        .reversed()).collect(Collectors.toList());
        System.out.println(eStream);

        // filter Empployee whose salary are more than 300
        List<Employe> eSalary = empList.stream().filter(emp -> emp.getSalary() > 300).collect(Collectors.toList());
        eSalary.forEach(s -> System.out.println(s));

        //Name of the Employee
        List<String> eName = empList.stream().map(Employe:: getEmpName).distinct().collect(Collectors.toList());
        System.out.println(eName);
    }
}

