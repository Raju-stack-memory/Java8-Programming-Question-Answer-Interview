package com.java8.findNthHighestSalary;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNthHighestSalary {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Anil", 1000);
        map.put("Bhavna", 1300);
        map.put("Mical", 1500);
        map.put("Tom", 1600);
        map.put("Ankit", 1200);
        map.put("Danil", 1700);
        map.put("Jaims", 1400);

/*
        Map.Entry<Integer, List<String>> integerListEntry = map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(2);
        System.out.println(integerListEntry);
*/
        //System.out.println(getDynamicNthHighestSalary(2,map));
        System.out.println(getNthHighestSalary(2, map));

       /* Map.Entry<String, Integer> entry = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);
        System.out.println(entry);
*/

    }

    // approch -1
    public static Map.Entry<Integer, List<String>> getDynamicNthHighestSalary(int num, Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(num - 1);
    }


    //approch-2
    public static Map.Entry<String, Integer> getNthHighestSalary(int num, Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(num - 1);
    }


}
