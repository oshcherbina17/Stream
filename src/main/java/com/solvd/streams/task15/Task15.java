package com.solvd.streams.task15;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task15 {
    public static void main(String[] args) {

        List<Good> goodList = Arrays.asList(
                new Good(1, "milk", "Poland"),
                new Good(2, "milk", "Romania")
        );
        List<StorePrice> storePriceList = Arrays.asList(
                new StorePrice(1, "BigShop", new BigDecimal("12.50")),
                new StorePrice(1, "SushiBar", new BigDecimal("10.50")),
                new StorePrice(2, "BigShop", new BigDecimal("12.50"))
        );
        getCountryStats(goodList, storePriceList).stream().forEach(e -> System.out.print(e + " "));
    }

    public static List<CountryStat> getCountryStats(List<Good> goodList, List<StorePrice> storePriceList) {
        Map<String, List<StorePrice>> storesByCountry = storePriceList.stream()
                .collect(Collectors.groupingBy(storePrice -> goodList.stream()
                        .filter(good -> good.getSku() == storePrice.getSku())
                        .map(Good::getCountryOfOrigin)
                        .findFirst()
                        .orElse("")));
        return storesByCountry.entrySet().stream()
                .map(entry -> {
                    String country = entry.getKey();
                    List<StorePrice> stores = entry.getValue();
                    int storeCount = stores.size();
                    BigDecimal minPrice = stores.stream()
                            .map(StorePrice::getPrice)
                            .min(BigDecimal::compareTo)
                            .orElse(BigDecimal.ZERO);
                    return new CountryStat(country, storeCount, minPrice);
                })
                .sorted(Comparator.comparing(CountryStat::getCountryOfOrigin))
                .collect(Collectors.toList());
    }
}
