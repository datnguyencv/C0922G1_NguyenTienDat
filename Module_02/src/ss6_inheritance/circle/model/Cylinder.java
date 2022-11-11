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
        return  "Cylinder{" +
                "Màu sắc " + getColor() +
                ", Bán kính " + getRadius() +
                ", Thể tích hình trụ " + getEquation() +
                '}';
    }

}
