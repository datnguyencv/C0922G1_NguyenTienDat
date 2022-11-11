package ss6_inheritance.circle.controlcircle;

import ss6_inheritance.circle.model.Circle;
import ss6_inheritance.circle.model.Cylinder;

public class ControlCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle("Pink", 3);
        System.out.println(c1);

        Circle cl1 = new Cylinder("Red", 3, 10);
        System.out.println(cl1);

    }
}