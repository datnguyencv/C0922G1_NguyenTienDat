package thi_module2.task2;

import java.util.Scanner;

public class DateUtil {
    private static final String VALIDATE = "^";

    public static boolean isValidDate(String str){
        return str.matches(VALIDATE);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        isValidDate(str);
    }
}
