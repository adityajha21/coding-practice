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
    private Long id;
    public Employee(String name, Long salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, department);
    }
    }
    class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aditya", 50L,"IT");
        Employee emp2 = new Employee("Deepak", 100L,"CS");
        Employee emp3 = new Employee("Sai", 300L,"CS");
        Employee emp4 = new Employee("Sai", 300L,"CS");
        HashSet<Employee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        System.out.println(employees.size());

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(3);
        System.out.println(hashSet.size());

      /*  List list = new ArrayList();
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
        System.out.println(map);*/



    }
    }
