import java.sql.Array;
import java.util.Scanner;

public class demoss4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập số cần tính tổng  ");
        int input = scanner.nextInt();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == input) {
                    System.out.println("Cap so nguyen can tim nam tai vi tri " + i + " và " + j + " là " + arr[i] + " và " + arr[j]);
                }
            }
        }
    }
}
