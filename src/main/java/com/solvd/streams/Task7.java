package com.solvd.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {

    public static void main(String[] args) {
        int k = 5;
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        symmetricalDiffMethod(integerList,k).stream().forEach(e -> System.out.print(e + " "));
    }

    public static List<Integer> symmetricalDiffMethod(List<Integer> integerList, int k) {
          List<Integer> result = integerList.stream()
                .skip(k)
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toSet())
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        List<Integer> evenValues = integerList.stream()
                .limit(k)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        result.addAll(evenValues.stream()
                .filter(i -> !result.contains(i))
                .collect(Collectors.toList()));
        return result;
    }
}
