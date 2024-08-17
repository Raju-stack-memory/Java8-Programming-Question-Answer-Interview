package com.java8.MapAndFlatmapExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVSFlatMap {

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("123456789", "987654321")),
                new Customer(102, "smit", "smit@gmail.com", Arrays.asList("8989898989", "6767676767")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("5656565656", "3434343434")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("21212121212121", "4355445454454"))
        ).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Customer> customerList = getAll();
        // customer.getEmail() is oneToOne mapping
        List<String> customerEmail = customerList.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(customerEmail);

        //  // customer.getPhoneNumbers() is oneToMany mapping
        List<List<String>> customerPhoneNumbers = customerList.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(customerPhoneNumbers);

        List<String> customerPhoneNumbersFlatMap = customerList.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(customerPhoneNumbersFlatMap);

    }

}
