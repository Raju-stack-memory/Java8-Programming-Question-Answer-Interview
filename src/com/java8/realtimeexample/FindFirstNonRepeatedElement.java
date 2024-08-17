package com.java8.realtimeexample;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedElement {
    public static void main(String[] args) {
        String input="iloveyoujavatechie";
        String findFirstNonRepeated =   Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
        System.out.println(findFirstNonRepeated);

        String input2 = "Java Hungry Blog Alive is Awesome";
        String findFirstNotRepeted2 = Arrays.stream(input2.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
        System.out.println(findFirstNotRepeted2);

    }
}
