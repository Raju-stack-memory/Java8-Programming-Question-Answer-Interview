package com.java8.Anagram;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "act";

        str1 = Stream.of(str1.split("")).sorted().collect(Collectors.joining());
        str2 = Stream.of(str2.split("")).sorted().collect(Collectors.joining());

        System.out.println(str1.equals(str2) ? "Anagram String " : "Anagram Not String");

    }

}
