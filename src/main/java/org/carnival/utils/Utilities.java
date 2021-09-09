package org.carnival.utils;

import java.util.List;
import java.util.stream.Collectors;

public class Utilities {

    public static Boolean checkCruiseDurations(String cruiseInfo) {
        int duration = Integer.parseInt(cruiseInfo.trim().substring(0, 1));
        return duration >= 6 && duration <= 9;
        }

    public static Boolean isSortedInIncreasingOrder(List<String> l) {
        List<Float> numbers = l.stream().map(Float::valueOf).collect(Collectors.toList());
        return numbers.stream()
                .sorted()
                .collect(Collectors.toList())
                .equals(numbers);
    }

    public static Boolean isPriceWithinRange(List<String> l, String lowerValue, String upperValue) {
        int lowerLimit = Integer.parseInt(lowerValue.replace("$", ""));
        int upperLimit = Integer.parseInt(upperValue.replace("$", ""));
        List<Float> numbers = l.stream().map(Float::valueOf).collect(Collectors.toList());
        return numbers.stream()
                .allMatch(price -> price >= lowerLimit && price <= upperLimit);
    }
}
