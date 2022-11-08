package ss3_array_method.exercise;

import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input row arr ");
        int inputRow = Integer.parseInt(sc.nextLine());
        System.out.println("Input colum arr ");
        int inputColum = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[inputRow][inputColum];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử số " + arr[i][j]);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                if ((arr[i].length - 1) - i == j) {
                    System.out.println(arr[i][j]);
                    sum += arr[i][j];
                }
            }
        }
        System.out.print("Kết quả là: ");
        System.out.println(sum);
    }
}

