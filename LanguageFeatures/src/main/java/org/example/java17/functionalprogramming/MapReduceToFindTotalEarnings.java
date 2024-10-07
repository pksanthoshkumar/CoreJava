package org.example.java17.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class MapReduceToFindTotalEarnings {

    public static void main(String[] args) {

        List<Employee> emps = Arrays.asList(
                new Employee("Santhosh", "IT", 600),
                new Employee("Surekha", "HR", 700),
                new Employee("Abhiram", "IT", 800)
        );

        System.out.println(getTotalSalary (emps));
    }

    static Double getTotalSalary(List<Employee> emps) {
        return emps.stream().map(e->e.salary()).reduce(0.0, (totalSalary, employeeSal) -> totalSalary + employeeSal);
    }
}



