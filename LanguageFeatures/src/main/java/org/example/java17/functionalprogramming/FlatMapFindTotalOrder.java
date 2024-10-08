package org.example.java17.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapFindTotalOrder {
    /*
    You have a list of customers, and each customer has a list of orders.
    Your task is to generate a flat list of all orders from all customers.
     */
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("C100", "Santhosh", Arrays.asList(
                        new Order("O100", 10), new Order("O200", 20)
                )),
                new Customer("C200", "Surekha", Arrays.asList(
                        new Order("O300", 15), new Order("O400", 30)
                ))
        );

        List<Order> orders = customers.stream().flatMap(c -> {
            return c.orders().stream();
        }).collect(Collectors.toList());

        System.out.println(orders);

        double total = customers.stream().flatMap(c -> c.orders().stream()).map(o -> o.qty()).reduce(0, (t, o) -> t + o);

        System.out.println(total);

        double total2 = customers.stream().flatMap(c -> c.orders().stream().map(o -> o.qty())).reduce(0, (t, o) -> t + o);
        System.out.println(total2);
    }
}
