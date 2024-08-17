package com.java8.findEmployeeDetails;

import java.util.*;
import java.util.stream.Collectors;

public class FindEmployeeDetailsWithDepartmentWise {
    //AndWhichDepartmentIsTakingHighestSalary
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", "HR", 5000),
                new Employee(102, "Bob", "IT", 6000),
                new Employee(103, "Charlie", "Finance", 7000),
                new Employee(104, "David", "IT", 8000),
                new Employee(105, "Eve", "Finance", 9000),
                new Employee(106, "Frank", "HR", 4000),
                new Employee(107, "Grace", "Finance", 10000)
        );


        // Grouping employees by the department
        Map<String, List<Employee>> employeesByDepartment = employees.stream().distinct().collect(Collectors.groupingBy(Employee::getDepartment));

       /* System.out.println("Employees by Department:");
        employeesByDepartment.forEach((department, emplist) -> {
            System.out.println(emplist + " " + emplist);
        });*/


        // finding the highest salary by department wise
        List<Map.Entry<String, Double>> collect= employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                //.orElseThrow((() -> new RuntimeException("No Department Found")));
                .stream().collect(Collectors.toList());
        System.out.println(collect);
        //System.out.println("Department wise the Highest Salary: " + departmentwise.getKey() + " with total salary: " + departmentwise.getValue());



        // Finding the highest salary employee in each department
        Map<String, Optional<Employee>> highestSalaryEmployeeInEachDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        System.out.println("Highest Salary Employee in Each Department:"+highestSalaryEmployeeInEachDept );
        /*highestSalaryEmployeeInEachDept.forEach((department, emp) -> {
            System.out.println(department + ": " + emp.orElse(null));
        });*/


    }
}
