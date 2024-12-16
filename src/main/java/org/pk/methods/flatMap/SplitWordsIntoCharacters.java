package org.pk.methods.flatMap;

import java.util.Arrays;
import java.util.List;

public class SplitWordsIntoCharacters {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi");
        words.stream().flatMap(w -> w.chars()
                        .mapToObj(ch ->(char) ch))
                .forEach(System.out::print);
    }
}
