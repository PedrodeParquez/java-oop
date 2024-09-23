package geometry2d;

public class Rectangle implements Figure{
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    public String toString(){
        return "Rectangle\nwidth = " + width + "\nheight = " + height + "\narea = " + area();
    }
}
