package com.java8.palindrom;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "RADAR";
        boolean match = IntStream.range(0, str.length() / 2).noneMatch(x -> str.charAt(x) != str.charAt(str.length() - x - 1));
        String result = match ? str + " is palindrome" : str + "is not palindrome";
        System.out.println(result);

    }
}
