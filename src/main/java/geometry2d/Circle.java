package geometry2d;

public class Circle implements Figure{
    private double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle\nradius = " + radius + "\narea = " + area();
    }
}
