//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n;
//        do {
//            System.out.print("Enter a positive odd number as the size of the square: ");
//            n = input.nextInt();
//        } while (n <= 0 || n%2 == 0);
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (j >= i && j <= n-i+1 && i <= n/2+1) {
//                    System.out.print("*");
//                } else if (j >= n-i+1 && j <= i && i >= n/2+1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
//
public class Main {
    public static void main(String[] args) {
        int n = 6; // thay đổi giá trị n tại đây để vẽ hình vuông khác
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print(" * ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i + j < n - 1) {
                    System.out.print("hsbn ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}


