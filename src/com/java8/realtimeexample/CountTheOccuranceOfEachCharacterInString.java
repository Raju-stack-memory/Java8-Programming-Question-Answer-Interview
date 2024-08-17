package com.java8.realtimeexample;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheOccuranceOfEachCharacterInString {
    public static void main(String[] args) {
        String input = "ilovejavatechie";
        Map<String, Long> countTheOccuranceOfEachCharacter = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countTheOccuranceOfEachCharacter);

        String str[] = {"Raju", "Raju", "Hibernate", "Hibernate", "Spring", "Spring", "Kishor", "Kishor", "Java", "Java"};
        Map<String, Long> collect = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
