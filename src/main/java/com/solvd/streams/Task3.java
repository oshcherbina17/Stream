package com.solvd.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("asd", "a", "basdw");
        String[] arr = new String[]{"asd", "a", "basdw"};
        sequenceList(list).stream().forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(sequenceArray(arr)).forEach(e -> System.out.print(e + " "));
    }

    public static List<String> sequenceList(List<String> list) {
        return list
                .stream()
                .filter(s1 -> s1.length() >= 1)
                .map(s1 -> String.valueOf(s1.charAt(0)) + s1.charAt(s1.length() - 1))
                .collect(Collectors.toList());
    }

    public static String[] sequenceArray(String[] arr) {
        return Arrays.stream(arr)
                .map(s -> String.valueOf(s.charAt(0))
                        + s.charAt(s.length() - 1))
                .toArray(String[]::new);
    }
}
