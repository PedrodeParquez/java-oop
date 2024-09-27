package geometry2d;

import Exceptions.InvalidSizeException;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) throws InvalidSizeException {
        if (radius <= 0) {
            throw new InvalidSizeException("Incorrect radius");
        }

        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle\nradius = " + radius + "\narea = " + area();
    }
}
