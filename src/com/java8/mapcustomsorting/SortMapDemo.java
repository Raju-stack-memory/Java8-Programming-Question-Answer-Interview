package com.java8.mapcustomsorting;

import com.java8.employeListOfcustomsorting.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);
        map.put("five", 5);
        map.put("seven", 7);


        //map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        // map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee(176, "Roshan", "IT", 60000), 60);
        employeeMap.put(new Employee(388, "Vikash", "CIVIL", 900000), 90);
        employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 50000), 50);
        employeeMap.put(new Employee(624, "Sorav", "CORE", 40000), 40);
        employeeMap.put(new Employee(176, "Prakash", "SOCIAL", 120000), 120);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);
        System.out.println("--------------------");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept))).forEach(System.out::println);
        System.out.println("--------------------");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
       // System.out.println(employeeMap);


    }
}
