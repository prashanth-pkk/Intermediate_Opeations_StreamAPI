package org.pk.methods.distinct;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        words.stream().distinct().forEach(System.out::println);
    }
}
