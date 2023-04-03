package com.solvd.streams.task15;

import java.math.BigDecimal;

public class StorePrice {
    private int sku;
    private String storeTitle;
    private BigDecimal price;
    private String countryOfOrigin;

    public StorePrice(int sku, String storeTitle, BigDecimal price) {
        this.sku = sku;
        this.storeTitle = storeTitle;
        this.price = price;
        this.countryOfOrigin = "";
    }

    public int getSku() {
        return sku;
    }

    public String getStoreTitle() {
        return storeTitle;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
}
