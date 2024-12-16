package org.pk.methods.mapToDouble;

import java.util.Arrays;
import java.util.List;

public class MapToDoubleStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange");
        double total_length = words.stream()
                .mapToDouble(String::length)
                .sum();
        System.out.println("Total Length of Words: " + total_length);
    }
}
