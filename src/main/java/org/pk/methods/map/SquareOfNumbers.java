package org.pk.methods.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6);
        List<Integer> output = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + output);
    }
}
