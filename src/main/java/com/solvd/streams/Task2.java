package com.solvd.streams;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        String[] arr = new String[]{"Hello", "world", "!", "Good", "morning", "!"};
        Arrays.stream(sortingList(arr)).forEach(System.out::println);
        sortingListWithLengths();
    }

    public static void sortingListWithLengths() {
        String[] arr = new String[]{"Hello", "world", "!", "Good", "morning", "!"};
        int[] lengths = Arrays
                .stream(arr)
                .mapToInt(s -> (int) s.codePoints().count())
                .sorted()
                .toArray();
        System.out.println("Count chars in each string: " + Arrays.toString(lengths));
    }

    public static int[] sortingList(String[] arr) {
        return Arrays
                .stream(arr)
                .mapToInt(s -> (int) s.codePoints().count())
                .sorted()
                .toArray();
    }
}
