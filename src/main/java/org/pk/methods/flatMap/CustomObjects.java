package org.pk.methods.flatMap;

import java.util.Arrays;
import java.util.List;

public class CustomObjects {
    public static class Person {
        String name;
        List<String> phoneNumbers;

        Person(String name, List<String> phoneNumbers) {
            this.name = name;
            this.phoneNumbers = phoneNumbers;
        }

        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", Arrays.asList("123-456", "789-101")),
                new Person("Jane", Arrays.asList("112-233", "445-667"))
        );
        people.stream()
                .flatMap(person -> person.getPhoneNumbers().stream())
                .forEach(System.out::println);
    }
}
