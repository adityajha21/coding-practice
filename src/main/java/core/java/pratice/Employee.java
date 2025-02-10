package core.java.pratice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Question asked in publics sapient
@Getter
@Setter
@ToString
public class Employee {
    private String name;
    private Long salary;
    private String department;
    public Employee(String name, Long salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    }
    class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aditya", 50L,"IT");
        Employee emp2 = new Employee("Deepak", 100L,"CS");
        Employee emp3 = new Employee("Bob", 200L,"IT");
        Employee emp4 = new Employee("Sai", 300L,"CS");

        List list = new ArrayList();
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp1);

       Optional maxSalary =  list.stream().max(Comparator.comparingLong(Employee :: getSalary));
        System.out.println("Maximum salary: " + maxSalary.get());

        // average salary by department
        Map<String, Long> result = (Map<String, Long>) list.stream().collect
                (Collectors.groupingBy(Employee :: getDepartment, Collectors.averagingLong(Employee :: getSalary)));
        System.out.println(result);

        //convert list to map
        Map<Employee, String> map = (Map<Employee, String>) list.stream()
                .collect(Collectors.toMap(Function.identity() , Employee:: getDepartment));
        System.out.println(map);



    }
    }
