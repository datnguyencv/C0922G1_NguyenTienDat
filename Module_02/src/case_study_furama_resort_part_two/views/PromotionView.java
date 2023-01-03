package case_study_furama_resort_part_two.views;

import java.util.Scanner;

public class PromotionView {
    private static Scanner input = new Scanner(System.in);

    public static void displayPromotionMenu() {
        System.out.println("1. Display list customers using service");
        System.out.println("2. Display list customers getting voucher");
        System.out.println("3. Return main menu");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println("Please enter a number again");
            }
        }
        switch (choice) {
            case 1:
                System.err.println("The system will be built soon ...");
                break;
            case 2:
                System.err.println("The system will be built soon ...");
                break;
            case 3:
                System.err.println("The system will be built soon ...");
                break;
            default:
                System.err.println("The system will be built soon ...");

        }
    }
}
