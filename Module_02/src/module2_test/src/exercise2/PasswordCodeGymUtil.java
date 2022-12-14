package exercise2;

import java.util.Scanner;

public class PasswordCodeGymUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsValidatePassword isValidatePassword = new IsValidatePassword();
        System.out.println("Input Classname: ");
        String inputPassword = scanner.nextLine();
        if (isValidatePassword.isValidatePassword(inputPassword)) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }
    }
}
