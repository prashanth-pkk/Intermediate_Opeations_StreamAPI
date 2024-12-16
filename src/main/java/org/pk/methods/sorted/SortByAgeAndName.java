package org.pk.methods.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByAgeAndName {
    public static class Person {
        int age;
        String name;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return age + " " + name;
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 25),
                new Person("David", 35)
        );
        people.stream()
                .sorted(Comparator.comparingInt(Person::getAge)
                        .thenComparing(Person::getName))
                .forEach(System.out::println);

    }
}
