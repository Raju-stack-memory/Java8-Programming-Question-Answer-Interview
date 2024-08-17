package com.java8.convertListOfStringIntoMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfStringConverttoMap {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        Map<String, Integer> stringLengthMap = strings.stream().collect(Collectors.toMap(str -> str, str -> str.length()));
        stringLengthMap.forEach((key, value) -> {
            System.out.println(" key : " + key + ", value : " + value);
        });
    }
}
