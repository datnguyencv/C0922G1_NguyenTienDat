import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            int j = 0;
//            while (j <= i) {
//                if (j == 0 || j == i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//                j++;
//            }
//            System.out.println();
//        }
//
//        for (int i = n - 2; i >= 0; i--) {
//            for (int j = 0; j <= n; j++) {
//                if (j == 0 || j == i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
       int n=5;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i || i == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
