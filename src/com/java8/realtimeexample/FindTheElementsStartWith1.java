package com.java8.realtimeexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheElementsStartWith1 {
    public static void main(String[] args) {
        int numbers[] = {23, 43, 1, 11, 21, 13, 45, 67, 21};

        List<String> findTheElementsStartWith1 = Arrays.stream(numbers)
                .boxed()
                .map(e -> e + "")
                .filter(e -> e.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(findTheElementsStartWith1);

    }
}
