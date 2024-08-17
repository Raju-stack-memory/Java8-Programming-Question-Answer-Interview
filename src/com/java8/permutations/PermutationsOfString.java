package com.java8.permutations;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {
    public static void main(String[] args) {
        String str = "ABC";
        List<String> permutations = new ArrayList<>();
        generatePermutations(str, "", permutations);
        permutations.forEach(System.out::println);
    }


    private static void generatePermutations(String str, String prefix, List<String> permutations) {
        if (str.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(rem, prefix + str.charAt(i), permutations);
            }
        }
    }

}
