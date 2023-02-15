import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
////        int num, n;
////        Scanner sc = new Scanner(System.in);
////        System.out.print("Nhập n: ");
////        num = sc.nextInt();
////        System.out.println();
////        n = num;
////        // vẽ phần tam giác ngược
////        for (int r = 1; r <= num; r++) {
////            // phần 1
////            for (int sp = 1; sp <= r; sp++) {
////                System.out.print(" ");
////            }
////            // phần 2
////            for (int c = 1; c <= n; c++) {
////                System.out.print("*");
////            }
////            // phần 3
////            for (int c = num - r; c >= 1; c--) {
////                System.out.print("*");
////            }
////            n--;
////            System.out.println();
////        }
////
////        // vẽ tam giác khuyết đỉnh
////        for (int r = 2; r <= num; r++) {
////            // phần 1
////            for (int sp = num - r + 1; sp >= 1; sp--) {
////                System.out.print(" ");
////            }
////            // phần 2
////            for (int c = 1; c <= r; c++) {
////                System.out.print("*");
////            }
////            // phần 3
////            for (int c = r - 1; c >= 1; c--) {
////                System.out.print("*");
////            }
////            System.out.println();
////        }
////
////    }
////}
////        public static void main(String[] args){
////            Scanner sc = new Scanner(System.in);
////            int hight, k = 0;
////            hight = 6;
////            for (int i = hight; i >= 2; --i) {
////                for (int space = 1; space <= hight - i; ++space) {
////                    System.out.print("  ");
////                }
////                for (int j = i; j <= 2 * i - 2; ++j) {
////                    System.out.print("* ");
////                }
////                for (int j = 0; j < i - 1; ++j) {
////                    System.out.print("* ");
////                }
////                System.out.println();
////            }
////            for (int i = 2; i <= hight; ++i, k = 0) {
////                for (int space = 1; space <= hight - i; ++space) {
////                    System.out.print("  ");
////                }
////                while (k != 2 * i - 2) {
////                    System.out.print("* ");
////                    k++;
////                }
////                System.out.println();
////            }
////        }}
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter an odd number as the number of lines: ");
            n = input.nextInt();
        }
        while (n <= 0 || n % 2 == 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i <= n / 2 + 1 && j >= i && j <= n - i + 1) || (i > n / 2 - 1 && j <= i && j > n - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
