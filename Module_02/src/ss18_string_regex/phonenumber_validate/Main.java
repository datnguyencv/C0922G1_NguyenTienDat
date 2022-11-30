package ss18_string_regex.phonenumber_validate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateNumberPhone validateNumberPhone = new ValidateNumberPhone();

        while (true) {
            System.out.println("Input PhoneNumber: ");
            String inputClass = scanner.nextLine();
            if (validateNumberPhone.validate(inputClass)) {
                System.out.println("PhoneNumber you input " + inputClass + " is True");
            } else {
                System.out.println("PhoneNumber you input " + inputClass + " is False");

            }
        }
    }
}
