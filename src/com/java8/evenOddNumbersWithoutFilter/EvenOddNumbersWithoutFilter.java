package com.java8.evenOddNumbersWithoutFilter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddNumbersWithoutFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        //List<Integer> evenNumber = partitionedNumbers.get(true);
        // List<Integer> oddNumber = partitionedNumbers.get(false);

        // System.out.println("Even Numbers: " + evenNumber);
        // System.out.println("Odd Numbers: " + oddNumber);


        // Printing even numbers
        System.out.print("Even Numbers: ");
        partitionedNumbers.get(true).forEach(num -> System.out.print(num + " "));

        // Printing odd numbers
        System.out.print("Odd Numbers: ");
        partitionedNumbers.get(false).forEach(num -> System.out.print(num + " "));


    }
}
