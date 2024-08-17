package com.java8.realtimeexample;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumberFromGivenArray {
    public static void main(String[] args) {
        int numbers[] = {5, 21, 11, 1, 2, 8, 7};
        Integer scecondHighestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(scecondHighestNumber);


        // secondlowestnumber
        Integer secondlowestnumber = Arrays.stream(numbers).boxed().sorted().skip(1).findFirst().get();
        System.out.println(secondlowestnumber);


    }
}
