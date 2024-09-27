package geometry2d;

import Exceptions.InvalidFigureException;
import Exceptions.InvalidSizeException;

public class Rectangle implements Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) throws InvalidSizeException {
        if ((width <= 0) || (height <= 0)) {
            throw new InvalidSizeException("Incorrect width or height");
        }

        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    public String toString() {
        return "Rectangle\nwidth = " + width + "\nheight = " + height + "\narea = " + area();
    }
}
