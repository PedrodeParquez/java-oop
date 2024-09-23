package geometry3d;

import geometry2d.Figure;

public class Cylinder {
    private final Figure base;
    private final double height;

    public Cylinder(Figure base, double height) {
        this.base = base;
        this.height = height;
    }

    public double volume(){
        return base.area() * height;
    }
}
