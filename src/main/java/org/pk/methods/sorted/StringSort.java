package org.pk.methods.sorted;

import java.util.Arrays;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "grape", "cherry");
        words.stream().sorted().forEach(System.out::println);
    }
}
