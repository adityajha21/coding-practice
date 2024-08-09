package org.example.exception;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test7 {
    public static void main(String[] args) {
        Employee a1 = new Employee("7",43500 ,"aditya", "");
        Employee a2 = new Employee("1",2000,"deepak", "");
        Employee a3 = new Employee("2",20000,"dinesh","");
        Employee a4 = new Employee("3",30000,"Ganesh","");
        Employee a5 = new Employee("4",22000,"Papad","");
        Employee a6 = new Employee("5",32000,"Tullu","");
        Employee a7 = new Employee("6",15000,"Gullu","");

        List<Employee> empList = new ArrayList<>();
        empList.add(a1);
        empList.add(a2);
        empList.add(a3);
        empList.add(a4);
        empList.add(a5);
        empList.add(a6);
        empList.add(a7);

        List<Integer> arrList = Arrays.asList(2,1,15,20,12);
        //sort in ascending order
        List<Integer> sortAsc = arrList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortAsc);

        //sort in descending order
        Comparator<Integer> comp = (i1,i2)->-i1.compareTo(i2);
        List<Integer> sortDesc = arrList.stream().sorted(comp).collect(Collectors.toList());
        System.out.println(sortDesc);

        //find min and max value
        Integer minValue = arrList.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(minValue);

        //sort employee list based on salary
        Comparator<Employee> salCheck = (i1, i2) -> i1.getSalary().compareTo(i2.getSalary());
        List<Employee> eList = empList.stream().sorted(salCheck).collect(Collectors.toList());
        System.out.println("Sort Employee based on Salary");
        System.out.println(eList);

        //print Employee name only , whose salary is less than 3000
        empList.stream().filter(e -> e.getSalary()<3000).forEach(s-> System.out.println(s.getName()));

        // emp salary less than 20000
        //emp salary is less that 20000, add 5000
        //emp min salary of employee

        List<Employee> empSal = empList.stream().filter(empsal ->empsal.getSalary() < 20000).collect(Collectors.toList());
        System.out.println(empSal);

        List<Integer> empMoreSal = empSal.stream().map(s-> s.getSalary()+4000).collect(Collectors.toList());
        System.out.println(empMoreSal);

        System.out.println(
                empSal.stream().max(Comparator.comparing(Employee :: getSalary))
        );

    }
}
