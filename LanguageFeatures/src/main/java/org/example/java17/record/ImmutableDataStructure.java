package org.example.java17.record;

public class ImmutableDataStructure {
    /*
    You need to model a Person entity in your application with fields like name, age, and email.
    The entity should be immutable, and you should provide methods to retrieve each field.
    Use Java 17 Records to achieve this in a concise way.
     */

    public static void main(String[] args) {
        Person person1 = new Person("Santhosh", 60, "santhosh@email.com");

        System.out.println(person1.email());
        System.out.println(person1.name());
        System.out.println(person1.age());
    }

}

record Person (String name, int age, String email) {}