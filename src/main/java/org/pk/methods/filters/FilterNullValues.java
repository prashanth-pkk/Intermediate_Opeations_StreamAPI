package org.pk.methods.filters;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterNullValues {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("fruits", "motors", null, "food", null);
        List<String> nullValue = list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println("Non null values : " + nullValue);
    }
}
