package com.solvd.streams.Task12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task12 {

    public static void main(String[] args) {

        List<Integer> integerList1 = Arrays.asList(1, 2, 33, 44);
        List<Integer> integerList2 = Arrays.asList(11, 22, 13);
        getValuePairs(integerList1, integerList2).stream().forEach(System.out::println);
    }

    public static List<NumberPair> getValuePairs(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .flatMap(i -> list2.stream().map(j -> new int[]{i, j}))
                .filter(pair -> pair[0] % 10 == pair[1] % 10)
                .map(pair -> new NumberPair(pair[0], pair[1]))
                .sorted(Comparator.comparingInt((NumberPair pair) -> pair.value_1).thenComparingInt(pair -> pair.value_2))
                .collect(Collectors.toList());
    }
}
