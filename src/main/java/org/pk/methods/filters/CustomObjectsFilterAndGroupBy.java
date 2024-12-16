package org.pk.methods.filters;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomObjectsFilterAndGroupBy {
    public static class Employee {
        String name;
        String department;
        double salary;

        Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String toString() {
            return name + " " + department + " " + salary;
        }

        public String getDepartment() {
            return department;
        }

        public Double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("John", "HR", 45000),
                new Employee("Jane", "IT", 80000),
                new Employee("Alex", "IT", 60000),
                new Employee("Chris", "Finance", 70000),
                new Employee("Sara", "IT", 90000),
                new Employee("Mike", "HR", 55000)
        );

        Map<String, List<Employee>> map = employeeList.stream()
                .filter(e -> e.getSalary() > 60000)
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Grouped Employees with salary > 60000");
        map.forEach((dep, employees) -> {
            System.out.println(dep + " " + employees);
        });
    }
}
