package ss3_array_method.exercise;

import java.util.Scanner;

public class FindTheLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input row arr ");
        int inputRow=Integer.parseInt(sc.nextLine());
        System.out.println("Input colum arr ");
        int inputColum=Integer.parseInt(sc.nextLine());
        int[][] arr=new int[inputRow][inputColum];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử số "+arr[i][j]);
                arr[i][j]=Integer.parseInt(sc.nextLine());
            }
        }
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        System.out.printf("Số lớn nhất là " + max);
    }
}
