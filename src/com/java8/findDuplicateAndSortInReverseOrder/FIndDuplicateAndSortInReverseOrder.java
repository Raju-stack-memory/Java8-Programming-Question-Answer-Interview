package com.java8.findDuplicateAndSortInReverseOrder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FIndDuplicateAndSortInReverseOrder {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Java", "Spring", "Microservices", "Python", "boot", "Dj", "Dj");

        // Finding duplicates and sorting them in reverse order
        List<String> duplicates = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // Printing the result
        System.out.println("Duplicates sorted in reverse order: " + duplicates);

    }
}
