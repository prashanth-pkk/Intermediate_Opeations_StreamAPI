package org.pk.methods.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange");
        List<Integer> output = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Length : " + output);
    }
}
