import java.util.Scanner;

public class CountCharFor {
    public static void main(String[] args) {
        String str;
        int i, size;
        int[] counter = new int[256];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter input text: ");
        str = scanner.nextLine();
        size = str.length();
        for (i = 0; i < size; i++) {
            counter[str.charAt(i)]++;
        }
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " - " + counter[i]);
            }
        }
    }
}
