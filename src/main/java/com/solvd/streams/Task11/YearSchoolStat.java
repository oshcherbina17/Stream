package com.solvd.streams.Task11;

public class YearSchoolStat {
    private int yearOfEntering;
    private int numberOfSchools;

    public YearSchoolStat(int yearOfEntering, int numberOfSchools) {
        this.yearOfEntering = yearOfEntering;
        this.numberOfSchools = numberOfSchools;
    }

    public int getYearOfEntering() {
        return yearOfEntering;
    }

    public int getNumberOfSchools() {
        return numberOfSchools;
    }

    @Override
    public String toString() {
        return "YearSchoolStat {" +
                "yearOfEntering = " + yearOfEntering +
                ", numberOfSchools = " + numberOfSchools +
                '}';
    }
}
