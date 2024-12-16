package org.pk.methods.limit;

import java.util.Arrays;
import java.util.List;

public class LimitNumberOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);
    }
}
