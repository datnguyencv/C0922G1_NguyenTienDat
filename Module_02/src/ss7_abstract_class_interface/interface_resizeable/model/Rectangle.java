package ss7_abstract_class_interface.interface_resizeable.model;


public class Rectangle extends Shape implements InterfaceResizeable {
    protected double width;
    protected double length;


    public Rectangle(double weigth, double length) {
        this.width = weigth;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double weigth, double length) {
        super(color, filled);
        this.width = weigth;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    public void resizeable(double percent) {
        this.width += this.width * percent;
        this.length += this.length * percent;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " width=" + width +
                ", length=" + length +
                ", color=" + color +
                ", area=" + getArea() +
                ", perimeter =" + getPerimeter() +
                '}';
    }
}