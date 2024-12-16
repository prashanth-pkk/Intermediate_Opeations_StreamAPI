package org.pk.methods.flatMap;

import java.util.Arrays;
import java.util.List;

public class SplitWords {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "The quick brown fox",
                "jumps over the lazy dog"
        );
        sentences.stream()
                .flatMap(n -> Arrays.stream(n.split(" ")))
                .forEach(System.out::println);
    }
}
