package com.mywipro;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Department dept1 = new Department("dept 1");
        Department dept2 = new Department("dept 2");
        Department dept3 = new Department("dept 3");
        Department dept4 = new Department("dept 4");

        List<Employee> employees = Arrays.asList(
                new Employee("a", dept1),
                new Employee("b", dept2),
                new Employee("c", dept1),
                new Employee("d", dept4),
                new Employee("e", dept3),
                new Employee("f", dept2),
                new Employee("g", dept1),
                new Employee("h", dept3)
        );

                /*// Group by department and print in ascending order
                employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.toList())) // Use TreeMap to sort departments
                .forEach((department, empList) -> {
                    empList.forEach(emp -> System.out.println(department + ": " + emp.getName()));
                });*/

        // Group by department
        Map<Department, List<Employee>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        // Sort the map entries by department name
        groupedByDepartment.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Department::getName)))
                .forEach(entry -> {
                    Department department = entry.getKey();
                    List<Employee> empList = entry.getValue();
                    empList.forEach(emp -> System.out.println(department + ": " + emp.getName()));
                });


    }
}
