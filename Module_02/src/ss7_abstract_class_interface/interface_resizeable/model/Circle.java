package ss7_abstract_class_interface.interface_resizeable.model;

public class Circle extends Shape implements InterfaceResizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void resizeable(double percent) {
        this.setRadius(this.getRadius() * (1 + percent));
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                ", color=" + color +
                ", area=" + getArea() +
                ", perimeter =" + getPerimeter() +
                '}';
    }
}
