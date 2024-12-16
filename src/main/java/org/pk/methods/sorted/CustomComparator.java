package org.pk.methods.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3, 7);
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
