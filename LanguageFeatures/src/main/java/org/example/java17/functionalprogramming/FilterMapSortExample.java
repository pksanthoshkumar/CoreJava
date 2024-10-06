package org.example.java17.functionalprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapSortExample {
    /*
    You are given a list of Person objects, each having a name, age, and city.
    Write a function to filter out people who are below the age of 50, map them to just their names,
    and return the names sorted in alphabetical order.
     */

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Santhosh", 60, "Stitsville"),
                new Person("Surekha", 60, "Stitsville"),
                new Person("Abhiram", 27, "Ottawa"),
                new Person("Adithya", 20, "Calicut"),
                new Person("Kannan", 20, "Kollam"),
                new Person("Gayathry", 20, "Cochin"),
                new Person("Aayaan", 5, "Spain"),
                new Person("Hari", 60, "Kollam")
                );

        System.out.println("Natural Order " + getSortedNatural (persons));
        System.out.println("Reverse Order " + getSortedReverse (persons));
        System.out.println("Reverse Order " + getNamesSortedByAgeThenName (persons));

    }

    static List <String> getSortedNatural(List<Person> persons) {
        List <String> names = persons.stream().filter(p-> p.age() < 50)
                .map(p->p.name())
                .sorted()
                .collect(Collectors.toList());

        return names;
    }

    static List <String> getSortedReverse(List<Person> persons) {
        List <String> names = persons.stream().filter(p-> p.age() < 50)
                .map(p->p.name())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return names;
    }

    public static List<String> getNamesSortedByAgeThenName(List<Person> people) {
        return people.stream()
                .sorted(Comparator.comparing(p-> ((Person)p).age()).thenComparing(p-> ((Person)p).name()))
                .map(person -> person.name() + " : " + person.age())
                .collect(Collectors.toList());
    }
}
