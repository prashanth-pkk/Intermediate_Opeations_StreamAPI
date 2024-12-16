package org.pk.methods.filters;

import java.util.Arrays;
import java.util.List;

public class MultipleConditions {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "mango", "peach");
        List<String> result = words.stream()
                .filter(w->w.length()>4 && w.contains("a"))
                .map(String::toUpperCase)
                .toList();

        System.out.println("Filtered and Transformed Words: " + result);

    }
}