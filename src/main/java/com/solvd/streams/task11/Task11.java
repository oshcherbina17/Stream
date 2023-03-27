package com.solvd.streams.task11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task11 {

    public static void main(String[] args) {
        List<Entrant> nameList = Arrays.asList(
                new Entrant(1, 1993, "Ivanov"),
                new Entrant(2, 1992, "Petrov"),
                new Entrant(3, 1993, "Pupkin"),
                new Entrant(3, 2000, "Zobkin"),
                new Entrant(3, 2000, "Zabkin")
        );
        getNumberOfDifferentData(nameList).stream().forEach(System.out::println);
    }

    public static List<YearSchoolStat> getNumberOfDifferentData(List<Entrant> nameList) {
        return nameList.stream()
                .collect(Collectors.groupingBy(Entrant::getYearOfEntering,
                        Collectors.mapping(Entrant::getSchoolNumber, Collectors.toSet())))
                .entrySet().stream()
                .map(entry -> new YearSchoolStat(entry.getKey(), entry.getValue().size()))
                .sorted(Comparator.comparing(YearSchoolStat::getNumberOfSchools).thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());
    }
}
