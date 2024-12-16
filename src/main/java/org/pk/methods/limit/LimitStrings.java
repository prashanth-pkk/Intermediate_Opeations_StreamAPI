package org.pk.methods.limit;

import java.util.Arrays;
import java.util.List;

public class LimitStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        words.stream()
                .limit(2)
                .forEach(System.out::println);
    }
}
