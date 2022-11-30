import java.util.Scanner;

public class demo_draw {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5-i; k++) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 1; j <= i*2; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }

        for (int i = 4; i >= 1; i--) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 1; j <= i*2; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}