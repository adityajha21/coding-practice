package java8;

import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
class Employee {
    private int id;
    private String name;
    private Long salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John"),
                new Employee(2, "Alice"),
                new Employee(3, "Bob"),
                new Employee(4,"adity")
        );

        // Sort by name in ascending order
        System.out.println("Sort by name in ascending order");
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName)).toList();
        sortedEmployees.forEach(System.out::println);

        // Sort Employee Names in Descending Order
        System.out.println("Sort Employee Names in Descending Order");
        employees.stream()
          .sorted(Comparator.comparing(Employee :: getName).reversed()).toList().forEach(System.out :: println);

        //Find Employees with Names Starting with "A"
        System.out.println("Find Employees with Names Starting with " +"A");
        employees.stream().filter(emp -> emp.getName().startsWith("A")).forEach(System.out::println);

        //Group Employees by ID Modulus
        System.out.println("Group Employees by ID Modulus");
        Map<Integer, List<Employee>> groupedEmployees =
                employees.stream().collect(Collectors.groupingBy(emp -> emp.getId()%2));
        System.out.println(groupedEmployees);

        //Find the Employee with the Longest Name
        System.out.println("Find the Employee with the Longest Name");
        Optional<Employee> longestNames = employees.stream().max(Comparator.comparingInt(e -> e.getName().length()));
        System.out.println(longestNames.get().getName());

        // Find list of Employee with longest names
        List<Employee> empList = employees.stream()
                                          .filter(e -> e.getName().length() ==
                                              employees.stream()
                                                       .max(Comparator.comparingInt(emp -> emp.getName().length()))
                                                       .map(emp -> emp.getName().length()) // Extract name length
                                                       .orElse(0)) // Handle empty stream safely
                                          .toList();
        System.out.println(empList);

        //Convert Employee List to a Map (ID -> Name)
        System.out.println("Convert Employee List to a Map");
        Map<Integer,String> newMap = employees.stream().
                collect(Collectors.toMap(Employee::getId,Employee::getName));
        System.out.println(newMap);

        //Find Duplicate Names
        System.out.println("Find Duplicate Names");
        Set<String> hashSet = new HashSet<>();
        List<Employee> duplicateNames = employees.stream().filter(e -> !hashSet.add(e.getName())).toList();
        System.out.println(duplicateNames);
        
    }

}
