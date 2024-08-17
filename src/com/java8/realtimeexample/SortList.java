package com.java8.realtimeexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortList {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);
        list.add(6);

        //System.out.println(list);

        //tradential way
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        // through stream api
        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);




    }
}
