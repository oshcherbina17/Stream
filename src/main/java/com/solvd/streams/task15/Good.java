package com.solvd.streams.task15;

public class Good {
    private int sku;
    private String name;
    private String countryOfOrigin;

    public Good(int sku, String name, String countryOfOrigin) {
        this.sku = sku;
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }
}
