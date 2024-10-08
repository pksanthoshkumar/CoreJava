package org.example.java17.functionalprogramming;

import java.util.List;

public record Customer (String customerId, String customerName, List<Order> orders) {}
