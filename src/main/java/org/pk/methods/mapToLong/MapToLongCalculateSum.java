package org.pk.methods.mapToLong;

import java.util.Arrays;
import java.util.List;

public class MapToLongCalculateSum {

    public static class Employee {
        String name;
        int age;

        Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return name + " " + age;
        }
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("John", 45),
                new Employee("Jane", 30),
                new Employee("Alex", 55)
        );
        long totalAge = list.stream()
                .mapToLong(n->n.getAge())
                .sum();
        System.out.println("Total age of employees : " + totalAge);
    }
}
