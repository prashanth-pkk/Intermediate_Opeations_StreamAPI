package org.pk.methods.filters;

import java.util.Arrays;
import java.util.List;

public class CustomObjectByMultipleConditions {
    static class Employee {
        String name;
        int age;
        int salary;

        public Employee(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String toString() {
            return name + " " + age + " " + salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Jack", 35, 45000),
                new Employee("Jones", 28, 55000),
                new Employee("Bob", 25, 51000)
        );
        List<Employee> employeeList = list.stream()
                .filter(e -> e.age > 25 && e.salary > 50000)
                .toList();
        System.out.println("The employee : " + employeeList);
    }
}
