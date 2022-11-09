package ss4_class_object.quadratic_equation;

import java.util.Scanner;
public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Input value b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Input value c");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        double n1 = quadraticEquation.getRoot1();
        double n2 = quadraticEquation.getRoot2();
        double n3 = quadraticEquation.getRoot3();
        System.out.println(delta);

        if (delta < 0) {
            System.out.println("The equation has no roots");
        }
        if (delta > 0) {
            System.out.printf("The equation has two roots: Root x1= %f,Root x2= %f ", n1, n2);
        }
        if (delta == 0) {
            System.out.printf("The equation double roots: Roots x1=x2=%f ", n3);
        }

    }
}