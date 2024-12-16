package org.pk.methods.flatMap;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        listOfLists.stream()
                .flatMap(n -> n.stream()
                        .filter(num -> num % 2 != 0))
                .forEach(System.out::println);
    }
}
