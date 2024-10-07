package org.example.java17.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByExample {

    /*
        You have a list of employees, and you want to partition them into two groups:

        Employees who earn more than or equal to $50,000.
        Employees who earn less than $50,000.
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

        Map<Boolean, List<Employee>> empMap =    emps.stream().collect(Collectors.partitioningBy(e-> e.salary() > 700));

        System.out.println(empMap.get(Boolean.TRUE));

        System.out.println("Less than 700");
        System.out.println(empMap.get(Boolean.FALSE));
    }
}
