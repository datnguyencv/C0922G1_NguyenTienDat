package ss11_dsa_stack_queue.convert_binary;

import java.util.Scanner;
import java.util.Stack;

public class ConvertBinary {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số cần chuyển sang hệ nhị phân");

        int n = Integer.parseInt(scanner.nextLine());
        Stack<Integer> result = new Stack<>();
        while (n != 0) {
            result.push(n % 2);
            n /= 2;
        }
        while (!result.isEmpty()) {
            System.out.print(result.pop());
        }
    }
}
