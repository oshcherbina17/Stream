package com.solvd.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task9 {

    public static void main(String[] args) {

        String[] stringList = {"ABC", "A", "BCD", "D"};
        getLengthAndSortListMethod(stringList).stream().forEach(e -> System.out.print(e + " "));
    }

    public static List<String> getLengthAndSortListMethod(String[] stringList) {
        Map<Character, Integer> map = Arrays.stream(stringList)
                .collect(Collectors.groupingBy(s -> s.charAt(0),
                        Collectors.summingInt(String::length)));
        List<String> result = map.entrySet().stream()
                .map(e -> e.getValue() + "-" + e.getKey())
                .sorted(Comparator.comparing((String s) -> Integer.parseInt(s.split("-")[0]))
                        .reversed()
                        .thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
        return result;
    }
}
