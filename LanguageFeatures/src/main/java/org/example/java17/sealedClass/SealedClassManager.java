package org.example.java17.sealedClass;

public class SealedClassManager {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Bike bike = new Bike();

        SealedClassManager manager = new SealedClassManager();
        System.out.println(manager.getDetails (car));
        System.out.println(manager.getDetails (truck));
        System.out.println(manager.getDetails (bike));
    }

    private String getDetails(Vehicle vehicle) {

        String details = switch (vehicle) {
            case Car c -> c.getDetails();
            case Bike b-> b.getDetails();
            case Truck t-> t.getDetails();
        };

        return details;
    }
}
