package com.solvd.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("asd", "a", "basdw");
        sequenceList(list).stream().forEach(System.out::println);
    }

    public static List<String> sequenceList(List<String> list) {
        return list
                .stream()
                .filter(s1 -> s1.length() >= 1)
                .map(s1 -> String.valueOf(s1.charAt(0)) + s1.charAt(s1.length() - 1))
                .collect(Collectors.toList());
    }
}
