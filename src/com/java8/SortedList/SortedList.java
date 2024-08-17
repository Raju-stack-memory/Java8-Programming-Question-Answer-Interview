package com.java8.SortedList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);


        // ascending order
        List<Integer> sortedList2 = myList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList2);


        // descending order
        List<Integer> sortedList = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList);


    }
}
