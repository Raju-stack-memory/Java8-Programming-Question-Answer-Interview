package com.java8.evenAndOddnumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 25, 24, 23, 26, 32, 44, 66);

        List<Integer> even = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> odd = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
        System.out.println(odd);


    }
}
