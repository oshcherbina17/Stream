package com.solvd.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Input symbol: ");
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.nextLine().toLowerCase(Locale.ROOT);
        search(symbol).stream().forEach(System.out::println);
    }

    public static List<String> search(String symbol) {
        List<String> list = Arrays.asList("name", "male", "Aseca", "aga", "animal");

        return list.stream()
                .map(String::toLowerCase)
                .filter(i -> i.startsWith(symbol))
                .filter(i -> i.endsWith(symbol))
                .collect(Collectors.toList());
    }
}
