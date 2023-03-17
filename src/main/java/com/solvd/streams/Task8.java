package com.solvd.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {

    public static void main(String[] args) {
        int k = 4;
        int d = 3;
        List<Integer> integerList = Arrays.asList(-10, 3, -3, 4, 55, 6);
        sortSequenceMethod(integerList, k, d).stream().forEach(e -> System.out.print(e + " "));
    }

    public static List<Integer> sortSequenceMethod(List<Integer> integerList, int k, int d) {
        List<Integer> result = integerList.stream()
                .filter(i -> i > d)
                .collect(Collectors.toList());

        result.addAll(integerList.stream()
                .skip(k)
                .collect(Collectors.toList()));

        return result.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());
    }
}
