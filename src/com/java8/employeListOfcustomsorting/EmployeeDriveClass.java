package com.java8.employeListOfcustomsorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeDriveClass {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", 60000));
        list.add(new Employee(388, "Vikash", "CIVIL", 900000));
        list.add(new Employee(470, "Bimal", "DEFENCE", 50000));
        list.add(new Employee(624, "Sorav", "CORE", 40000));
        list.add(new Employee(176, "Prakash", "SOCIAL", 120000));
        return list;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = getEmployees();
        employeeList.stream().sorted(Comparator.comparingInt(Employee::getId)).forEach(System.out::println);
        System.out.println("----------------------------");
        employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        System.out.println("----------------------------");
        employeeList.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
        System.out.println("----------------------------");
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);


    }
}
