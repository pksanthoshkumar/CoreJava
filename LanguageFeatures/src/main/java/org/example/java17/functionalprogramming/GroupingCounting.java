package org.example.java17.functionalprogramming;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingCounting {
    /*
    You have a list of employees, each with a name, department, and salary.
    Write a function to group employees by their department and count how many employees belong to each department.
     */

    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee("Santhosh", "IT", 600),
                new Employee("Surekha", "HR", 700),
                new Employee("Abhiram", "IT", 800),
                new Employee("Sunitha", "LW", 1000),
                new Employee("Unni", "MK", 700),
                new Employee("Hari", "MK", 500)
        );

        Map<String, Long> empMap = emps.stream()
                .collect(Collectors.groupingBy(e -> ((Employee) e).dept(), Collectors.counting()));

        System.out.println(empMap);

        Map<String, Double> empMap1 = emps.stream()
                .collect(Collectors.groupingBy(e -> ((Employee) e).dept(), Collectors.summingDouble(e -> ((Employee) e).salary())));

        System.out.println(empMap1);

        double salary = emps.stream().map(e -> e.salary()).reduce(0.0, (s1, s2) -> s1 + s2);

        System.out.println(salary);
    }
}
