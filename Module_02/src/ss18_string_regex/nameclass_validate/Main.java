package ss18_string_regex.nameclass_validate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateClassName validateClassName = new ValidateClassName();
        while (true) {
            System.out.println("Input Classname: ");
            String inputClass = scanner.nextLine();
            if (validateClassName.validate(inputClass)) {
                System.out.println("Classname you input " + inputClass + " is True");
            } else {
                System.out.println("Classname you input " + inputClass + " is False");

            }
        }
    }
}


