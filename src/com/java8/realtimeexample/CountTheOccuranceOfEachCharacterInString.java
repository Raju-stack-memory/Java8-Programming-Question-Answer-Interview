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

        String atr2[] = {"a", "b", "c", "a", "a", "d", "e", "e"};
        Map<String, Long> map = Arrays.stream(atr2)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);


        int arr[] = {1, 2, 3, 4, 4, 5, 5, 3, 5, 2, 1, 6, 7, 8, 9, 2,};
        Map<Integer, Long> collect1 = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);


    }
}
