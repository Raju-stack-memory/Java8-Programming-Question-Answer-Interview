package com.java8.reverseString;

import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        char[] array = "java".toCharArray();
        IntStream.range(0, array.length).mapToObj(x -> array[(array.length - 1) - x]).forEach(System.out::print);

    }
}
