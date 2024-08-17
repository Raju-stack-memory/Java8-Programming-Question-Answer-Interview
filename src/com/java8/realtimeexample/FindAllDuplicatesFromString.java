package com.java8.realtimeexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllDuplicatesFromString {
    public static void main(String[] args) {
        String input = "iloveyoujavatechie";
        List<String> findAllDuplicatesFromString = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(findAllDuplicatesFromString);


        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        List<Integer> collect = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);


        int[] items = { 10, 0, 30, 2, 7, 5, 90, 76, 100, 45, 55 };
        int asInt = Arrays.stream(items).min().getAsInt();
        System.out.println(asInt);


        List<Integer> list =Arrays.asList(4,12,19,10,90,30,60,17,90);
        List<Integer> collect1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect1);



        List<String> list1 = Arrays.asList("Java", "Java", "Spring", "Microservices", "Python", "boot", "Dj", "Dj");
        List<String> stringStartwit1 = list1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(stringStartwit1);


    }
}
