package org.pk.methods.mapToInt;

import java.util.Arrays;
import java.util.List;

public class CustomMapToIntStream {
    public static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String toString() {
            return name + " " + salary;
        }

        public double getSalary() {
            return salary;
        }

        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee("John", 45000),
                    new Employee("Jane", 75000),
                    new Employee("Alex", 60000)
            );
            double avg_salary = employees.stream().mapToInt(e -> (int) e.getSalary())
                    .average()
                    .orElse(0);
            System.out.println("The average salary : " + avg_salary);
        }
    }
}
