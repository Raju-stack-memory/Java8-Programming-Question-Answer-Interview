package com.jtcindia;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDriveClass {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        // Query 3.1 : How many male and female employees are there in the organization?
        Map<String, Long> maleAndFemaleInOrganazation = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(maleAndFemaleInOrganazation);


        //Query 3.2 : Print the name of all departments in the organization?
        //Map<String, Set<Employee>> departMentList = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //Query 3.3 : What is the average age of male and female employees?
        Map<String, Double> averageAgeOfMaleAndFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(averageAgeOfMaleAndFemale);

        //Query 3.4 : Get the details of highest paid employee in the organization?
        Optional<Employee> highestPaidSalary = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(highestPaidSalary);

        //Query 3.5 : Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

        //Query 3.6 : Count the number of employees in each department?
        Map<String, Long> countEmployeeOfEachDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(countEmployeeOfEachDepartment);

        //Query 3.7 : What is the average salary of each department?
        Map<String, Double> averageSalaryOfEachDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalaryOfEachDepartment);

        //Query 3.8 : Get the details of youngest male employee in the product development department?
        Optional<Employee> youngestMaleEmployeeInProductDepartment = employeeList.stream().filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development").min(Comparator.comparingInt(Employee::getAge));
        System.out.println(youngestMaleEmployeeInProductDepartment);

        // Query 3.9 : Who has the most working experience in the organization?
        Optional<Employee> mostWorkingExperenceInOrganization = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println(mostWorkingExperenceInOrganization);

        //Query 3.10 : How many male and female employees are there in the sales and marketing team?
        Map<String, Long> findMaleAndFemaleEmployeInSalesandMarketingteam = employeeList.stream().filter(e -> e.getDepartment() == "Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(findMaleAndFemaleEmployeInSalesandMarketingteam);

        //Query 3.11 : What is the average salary of male and female employees?
        Map<String, Double> averageSalaryOfmaleAndFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalaryOfmaleAndFemale);

        // Query 3.12 : List down the names of all employees in each department?
        Map<String, List<Employee>> theNamesOfAllEmployeesInEachDepartment = employeeList.stream().distinct().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(theNamesOfAllEmployeesInEachDepartment);

        //Query 3.13 : What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(" Average Salary : " + employeeSalaryStatistics.getAverage());
        System.out.println(" Total Salary : " + employeeSalaryStatistics.getSum());

        //Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 25)).forEach((key, value) -> {
                    System.out.println(key ? "Employees older than 25 years :" : "Employees younger than or equal to 25 years :");
                    value.forEach(e -> System.out.println(e.getName()));
                });

        // Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> oldEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee employee = oldEmployee.get();
        System.out.println("Name : " + employee.getName());
        System.out.println("Age : " + employee.getAge());
        System.out.println("Department : " + employee.getDepartment());


    }

}
