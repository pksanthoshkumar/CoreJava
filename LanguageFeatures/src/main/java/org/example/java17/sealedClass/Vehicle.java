package org.example.java17.sealedClass;

public abstract sealed class Vehicle permits Car, Truck, Bike {
    public abstract String getDetails ();
}
