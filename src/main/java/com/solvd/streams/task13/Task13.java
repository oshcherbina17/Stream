package com.solvd.streams.task13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task13 {

    public static void main(String[] args) {
        List<Integer> yearList = Arrays.asList(2001, 1999, 2000, 2002, 2003);
        List<Entrant> nameList = Arrays.asList(
                new Entrant(11, 2003, "Snow"),
                new Entrant(11, 2001, "Stark"),
                new Entrant(11, 2001, "Lannister"),
                new Entrant(10, 1999, "Targaryen"),
                new Entrant(10, 1999, "Greyjoy"),
                new Entrant(10, 1999, "Snow"),
                new Entrant(10, 2000, "Stark"),
                new Entrant(14, 2001, "Lannister"),
                new Entrant(15, 2000, "Targaryen"),
                new Entrant(10, 2000, "Snow"),
                new Entrant(12, 2003, "Stark"),
                new Entrant(11, 2003, "Lannister"),
                new Entrant(10, 2003, "Targaryen")
        );
        getNumberOfDifferentData(nameList, yearList).stream().forEach(System.out::println);
    }

    public static List<YearSchoolStat> getNumberOfDifferentData(List<Entrant> nameList, List<Integer> yearList) {
        return yearList.stream()
                .map(year -> {
                    List<Integer> schools = nameList.stream()
                            .filter(e -> e.getYearOfEntering() == year)
                            .map(e -> e.getSchoolNumber())
                            .distinct()
                            .collect(Collectors.toList());
                    return new YearSchoolStat(year, schools.size());
                })
                .sorted(Comparator.comparingInt(YearSchoolStat::getNumberOfSchools)
                        .thenComparingInt(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());
    }
}
