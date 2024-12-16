package org.pk.methods.distinct;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 1);
        numbers.stream().distinct().forEach(System.out::println);
    }
}
