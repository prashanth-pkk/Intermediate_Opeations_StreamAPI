package org.pk.methods.filters;

import java.util.Arrays;
import java.util.List;

public class CustomObjectByAge {
    public static class Employee {
        String name;
        int age;

        Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " " + age;
        }
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("joe", 29),
                new Employee("rock", 27),
                new Employee("Goldie", 21)
        );
        List<Employee> employeeList = list.stream()
                .filter(n -> n.age > 21)
                .toList();
        System.out.println("The age of the employees greater than 21 : " + employeeList);
    }
}
