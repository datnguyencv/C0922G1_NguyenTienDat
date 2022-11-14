package ss7_abstract_class_interface.interface_resizeable.model;

public abstract class Shape implements InterfaceResizeable {
    protected String color = "Green";
    protected boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                " color='" + color +
                ", filled=" + filled +
                '}';
    }
}
