package org.pk.methods.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveDuplicatesFromObjects {
    public static class Person {
        int age;
        String name;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return age + " " + name;
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return age == person.age && name.equals(person.name);
        }

        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Alice", 25),
                new Person("Charlie", 35)
        );
        people.stream().distinct().forEach(System.out::println);
    }
}
