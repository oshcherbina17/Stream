package com.solvd.streams;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Task5 {

    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 13);
        filterIntegerList(listInt).stream().forEach(System.out::println);
    }

    public static List<Integer> filterIntegerList(List<Integer> list) {
        return list
                .stream()
                .filter(x -> x % 2 == 1)
                .sorted()
                .collect(toList());
    }
}
