package com.java8.findTotalNumberOfElement;

import java.util.Arrays;
import java.util.List;

public class FindTotalNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(21, 21, 3, 2, 43, 54, 65, 76);
        long count = list.stream().count();
        System.out.println(count);
    }
}
