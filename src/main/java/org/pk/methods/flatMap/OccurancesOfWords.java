package org.pk.methods.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurancesOfWords {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Hello World",
                "World of Streams",
                "Java is great"
        );
        Map<String, Long> wordCount = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        wordCount.forEach((w, k) -> System.out.println(w + " " + k));
    }
}
