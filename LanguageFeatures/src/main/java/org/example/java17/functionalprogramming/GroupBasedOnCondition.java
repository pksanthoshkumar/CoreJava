package org.example.java17.functionalprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBasedOnCondition {
    /*
    Let’s say you want to group employees into three salary ranges:

    Low: Employees earning less than $30,000.
    Mid: Employees earning between $30,000 and $70,000.
    High: Employees earning more than $70,000.
     */

    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee("Santhosh", "IT", 60000),
                new Employee("Surekha", "HR", 70000),
                new Employee("Abhiram", "IT", 80000),
                new Employee("Sunitha", "LW", 100000),
                new Employee("Unni", "MK", 70000),
                new Employee("Hari", "MK", 50000)
        );

        Map<String, List<Employee>> empMap = emps.stream().collect(Collectors.groupingBy(e-> {
            if (e.salary() <= 50000 ) {
                return "low";
            } else if (e.salary() > 50000 && e.salary() <= 80000) {
                return "medium";
            }else {
                return "high";
            }
        }));

        System.out.println("Low paid" );
        empMap.getOrDefault("low", Collections.emptyList()).forEach(e-> System.out.println(e.name()));

        System.out.println("Medium paid" );
        empMap.getOrDefault("medium", Collections.emptyList()).forEach(e-> System.out.println(e.name()));

        System.out.println("High paid" );
        empMap.getOrDefault("high", Collections.emptyList()).forEach(e-> System.out.println(e.name()));
    }
}
