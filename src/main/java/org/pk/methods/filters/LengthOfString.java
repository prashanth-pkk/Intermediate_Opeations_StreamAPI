package org.pk.methods.filters;

import java.util.Arrays;
import java.util.List;

public class LengthOfString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "bus", "car", "mango", "pineapple");
        List<String> lengthOfWords = list.stream()
                .filter(word -> word.length() > 5)
                .toList();
        System.out.println("The Longest words more than 5 characters : " + lengthOfWords);
    }
}
