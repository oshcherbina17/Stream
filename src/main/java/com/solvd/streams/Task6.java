package com.solvd.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4);
        List<String> stringList = Arrays.asList("1aa", "aaa", "1", "a");
        filterList(numbers, stringList).stream().forEach(e -> System.out.print(e + " "));
    }

    public static List<String> filterList(List<Integer> num, List<String> list) {
        return num.stream()
                .map(n -> list.stream()
                        .filter(s -> s.matches("^\\d.*") && s.length() == n)
                        .findFirst()
                        .orElse("Not found"))
                .collect(Collectors.toList());
    }
}
