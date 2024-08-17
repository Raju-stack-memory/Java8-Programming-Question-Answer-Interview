package com.java8.realtimeexample;

import java.util.Arrays;
import java.util.List;

public class StringJoin {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6");
        String stringJoin = String.join("-", list);
        System.out.println(stringJoin);


    }
}
