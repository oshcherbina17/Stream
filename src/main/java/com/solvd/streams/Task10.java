package com.solvd.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {

    public static void main(String[] args) {
        String[] stringList = {"asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop"};
        convertingAndSortedSequenceMethod(stringList).stream().forEach(e -> System.out.print("'" + e + "'" + " "));
    }

    public static List<Character> convertingAndSortedSequenceMethod(String[] stringList) {
        return Arrays.stream(stringList)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .map(s -> Character.toUpperCase(s.charAt(s.length() - 1)))
                .collect(Collectors.toList());
    }
}
