package org.example.record;

public class PatternMatching {
    /*
    You are dealing with different shapes in a geometric system, and each shape has its own set of properties.
    Create a record for Circle and Rectangle, and use Pattern Matching for switch in Java 17 to calculate the area of each shape.
     */

    public static void main(String[] args) {
        Shape circle  = new Circle(2.5);
        Shape square = new Square(2.5);
        Shape rectangle = new Rectangle(2, 2.5);

        PatternMatching pattern = new PatternMatching();

        System.out.println("Circle : " + pattern.calculateArea(circle));
        System.out.println("Square : " + pattern.calculateArea(square));
        System.out.println("Rectangle : " + pattern.calculateArea(rectangle));

    }

    Double calculateArea (Shape shape) {

        Double area = 0.0d;

        switch (shape) {
            case Circle c-> {
                area = Math.PI * c.radius() * c.radius();
            }case Square s-> {
                area = s.length() * s.length();
            }case Rectangle r-> {
                area = r.length() * r.width();
            }default -> {
                area = 0.0d;
            }
        }

        return area;
    }
}

