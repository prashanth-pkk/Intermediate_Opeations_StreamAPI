package org.pk.methods.peek;

import java.util.Arrays;
import java.util.List;

public class ForDebugging {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .peek(n -> System.out.println("Before processing: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("After processing: " + n))
                .forEach(System.out::println);
    }
}
