package ss3_array_method.exercise;

import java.util.Scanner;

public class FindTheMinner {
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
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.printf("Số nhỏ nhất là " + min);
    }
}
