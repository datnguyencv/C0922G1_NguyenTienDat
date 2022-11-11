package ss6_inheritance.circle.model;

public class Cylinder extends Circle {
    private double h;

    public Cylinder(String color, double radius, double h) {
        super(color, radius);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getEquation() {
        return Math.PI * getRadius() * getRadius() * h;
    }

    @Override
    public String toString() {
        return  "Màu sắc " + getColor() +
                ", Bán Kính " + getRadius() +
                ", Diện Tích " + getEquation() +
                '}';
    }

}
