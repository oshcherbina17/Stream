package com.solvd.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {
        System.out.print("Input positive number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<String> list = Arrays.asList("8DC3", "4F", "33", "AB", "3S", "S3", "A1", "2A3G", "1B");
        filterList(list, number).stream().forEach(System.out::println);
    }

    public static List<String> filterList(List<String> list, int number) {
        return list
                .stream()
                .filter(s -> s.length() == number && Character.isDigit(s.charAt(s.length() - 1))
                        && Character.isLetter(s.charAt(0)))
                .sorted()
                .collect(Collectors.toList());
    }
}
