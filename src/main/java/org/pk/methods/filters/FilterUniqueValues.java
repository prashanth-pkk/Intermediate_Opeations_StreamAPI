package org.pk.methods.filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterUniqueValues {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> number = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("The unique values : " + number);
    }
}
