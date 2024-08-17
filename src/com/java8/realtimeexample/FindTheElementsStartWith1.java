package com.java8.realtimeexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FindTheElementsStartWith1 {
    public static void main(String[] args) {
        int numbers[] = {23, 43, 1, 11, 21, 13, 45, 67, 21};
        List<String> findTheElementsStartWith1 = Arrays.stream(numbers)
                .boxed()
                .map(e -> e + "")
                .filter(e -> e.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(findTheElementsStartWith1);

        List<String> strings = Arrays.asList("Apple", "Banana", "Apricot", "Avocado", "Berry", "Cherry");
        List<String> stringStartwit1 = strings.stream()
                .filter(x -> x.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(stringStartwit1);

        List<Integer> integerList = Arrays.asList(11, 22, 33, 12, 77, 11, 12, 23, 44, 55, 44, 33);
        List<Integer> list = integerList.stream()
                .filter(x -> x.toString().startsWith("11"))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
