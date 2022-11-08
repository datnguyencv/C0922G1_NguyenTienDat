package ss3_array_method.exercise;

import java.util.Scanner;

public class SumInColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input row arr ");
        int inputRow = Integer.parseInt(sc.nextLine());
        System.out.println("Input colum arr ");
        int inputColum = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[inputRow][inputColum];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử số " + arr[i][j]);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int indexCol;
        int sum = 0;
        do {
            System.out.println("Nhập cột cần tính tổng ");
            indexCol = Integer.parseInt(sc.nextLine());
            if ((indexCol < 0 || indexCol > arr.length - 1)) {
                System.out.println("Bạn cần nhập cột trong khoảngt[0;" + (indexCol - 1) + "] ");
            }
        } while (indexCol < 0 || indexCol > arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == indexCol) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.print("Kết quả là: ");
        System.out.println(sum);

    }
}
