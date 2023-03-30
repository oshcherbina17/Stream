package com.solvd.streams.task14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Task14 {

    public static void main(String[] args) {
        List<Supplier> supplierList = Arrays.asList(
                new Supplier(1, 1993, "Madison Avenue"),
                new Supplier(2, 1994, "Wall Street"),
                new Supplier(3, 1995, "Grand Street"),
                new Supplier(4, 1996, "Broadway"),
                new Supplier(5, 1996, "Broadway")
        );

        List<SupplierDiscount> supplierDiscountList = Arrays.asList(
                new SupplierDiscount(1, 9, "Zara"),
                new SupplierDiscount(2, 9, "Zara"),
                new SupplierDiscount(3, 10, "H&M"),
                new SupplierDiscount(4, 10, "H&M"),
                new SupplierDiscount(5, 10, "Nike")
        );
        maxDiscountOwnerMethod(supplierList, supplierDiscountList).entrySet().forEach(e -> System.out.print(e.getKey() + ": " + e.getValue() + " "));
    }

    public static Map<String, Supplier> maxDiscountOwnerMethod(List<Supplier> supplierList, List<SupplierDiscount> supplierDiscountList) {
        return new TreeMap<>(supplierDiscountList.stream()
                .collect(Collectors.groupingBy(SupplierDiscount::getStoreName,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(SupplierDiscount::getDiscountPercentage)
                                        .thenComparingInt(supplierDiscount -> (-1) * supplierDiscount.getCustomerId())),
                                Optional::get)))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        e -> supplierList.stream()
                                .filter(s -> s.getCustomerId() == e.getValue().getCustomerId())
                                .findFirst()
                                .get())));
    }
}
