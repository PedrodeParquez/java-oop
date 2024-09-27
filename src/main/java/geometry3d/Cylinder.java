package geometry3d;

import Exceptions.InvalidFigureException;
import Exceptions.InvalidSizeException;
import geometry2d.Figure;

public class Cylinder {
    private final Figure base;
    private final double height;

    public Cylinder(Figure base, double height) throws InvalidFigureException, InvalidSizeException {
        if (base == null) {
            throw new InvalidFigureException("Base is null");
        }

        if (height <= 0) {
            throw new InvalidSizeException("Incorrect height");
        }

        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }
}
