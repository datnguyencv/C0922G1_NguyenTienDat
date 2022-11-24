package ss15_exception_debug;

import java.util.Scanner;

public class MainIlegalTriangleException {
    public static void main(String[] args) {
        IlegalTriangleException();
    }

    public static void IlegalTriangleException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three side of triangle enter after input ");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        if (a <= 0 | b <= 0 | c <= 0 | a + b < c || a + c < b || b + c < a) {
            try {
                throw new ShowException("Input is not side of triangle");
            } catch (ShowException showException) {
                System.err.println(showException.getMessage());
            }
        }
    }
}
