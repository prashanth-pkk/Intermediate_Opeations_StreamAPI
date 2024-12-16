package org.pk.methods.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomObjects {
    public static class Employee {
        String name;
        String department;
        double salary;

        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String toString() {
            return name + " " + department + " " + salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "HR", 45000),
                new Employee("Jane", "IT", 75000),
                new Employee("Alex", "IT", 60000),
                new Employee("Sara", "Finance", 70000)
        );

        List<String> output = employees.stream()
                .map(emp -> emp.name + " works in " + emp.department + " earning $ " + emp.salary)
                .collect(Collectors.toList());
        System.out.println("Formatted Employee Details: ");
        output.forEach(System.out::println);
    }
}
