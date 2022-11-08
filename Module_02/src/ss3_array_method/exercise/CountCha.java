package ss3_array_method.exercise;

import java.util.Scanner;

public class CountCha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Nguyen Tien Dat";
        System.out.println("Nhập kí tự cần kiểm tra");
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (input.charAt(0) == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện ký tự " + input + " là " + count);
    }
}