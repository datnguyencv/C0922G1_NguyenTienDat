import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String arg1 = scanner.nextLine();
        amendTheSentence(arg1);
    }

    public static void amendTheSentence(String arg1) {

        for (int i = 0; i < arg1.length(); i++) {
            if (i != 0 && Character.isUpperCase(arg1.charAt(i))) {
                System.out.print(" " + Character.toLowerCase(arg1.charAt(i)));
            } else if (i == 0) {
                System.out.print(Character.toLowerCase(arg1.charAt(i)));
            } else {
                System.out.print(arg1.charAt(i));
            }
        }

    }
}