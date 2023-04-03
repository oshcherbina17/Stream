package com.solvd.streams.task15;

import java.math.BigDecimal;

public class CountryStat {
    private String countryOfOrigin;
    private int numStores;
    private BigDecimal minPrice;

    public CountryStat(String countryOfOrigin, int numStores, BigDecimal minPrice) {
        this.countryOfOrigin = countryOfOrigin;
        this.numStores = numStores;
        this.minPrice = minPrice;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getNumStores() {
        return numStores;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    @Override
    public String toString() {
        return "CountryStat{" + countryOfOrigin + '\'' +
                 numStores +
                ", BigDecimal=" + minPrice +
                '}';
    }
}
