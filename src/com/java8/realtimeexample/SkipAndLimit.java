package com.java8.realtimeexample;

import java.util.stream.IntStream;

public class SkipAndLimit {
    public static void main(String[] args) {

        // skip & limit example (2-9)
        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(System.out::print);

    }
}
