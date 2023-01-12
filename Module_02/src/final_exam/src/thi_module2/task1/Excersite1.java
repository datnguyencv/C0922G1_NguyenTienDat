package thi_module2.task1;

import java.util.Scanner;

public class Excersite1 {
    ///Tổng ước số chẵn < = 5000 , số nguyên dương
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào s nguyên dương n cần tính toán: ");
        int number = 0;
        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (number > 0 && number<=5000) {
                sumEvenDiv(number);
            } else System.out.println("Nhập số NGUYÊN lớn hơn không và <=5000");
        } while (true);
    }
    public static void sumEvenDiv(int number) {

        int sumEven = 0;
        for (int i = 1; i <= number; i++) {
            if ((number % i == 0)&&(i%2==0)) {
                sumEven += i;
                System.out.print(i+" ,");
            }
        }
        System.out.println(" TỔNG Ước số chẵn là : " + sumEven);
    }
}
