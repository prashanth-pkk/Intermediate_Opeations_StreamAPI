package org.pk.methods.flatMap;

import java.util.Arrays;

public class ArrayToFlatMap {
    public static void main(String[] args) {
        String[][] arrayOfArrays = {
                {"apple", "banana"},
                {"cherry", "date"},
                {"elderberry", "fig"}
        };
        Arrays.stream(arrayOfArrays)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);
    }
}
