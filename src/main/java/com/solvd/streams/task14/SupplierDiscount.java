package com.solvd.streams.task14;

public class SupplierDiscount {
    private int customerId;
    private int discountPercentage;
    private String storeName;

    public SupplierDiscount(int customerId, int discountPercentage, String storeName) {
        this.customerId = customerId;
        this.discountPercentage = discountPercentage;
        this.storeName = storeName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public String getStoreName() {
        return storeName;
    }

}
