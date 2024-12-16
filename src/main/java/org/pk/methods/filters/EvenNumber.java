package org.pk.methods.filters;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7);
        List<Integer> evenNumber = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("The list of Even numbers : " + evenNumber);
    }
}
