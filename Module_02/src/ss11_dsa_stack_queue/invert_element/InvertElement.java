package ss11_dsa_stack_queue.invert_element;

import java.util.Scanner;
import java.util.Stack;

public class InvertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi phần tử");
        String input = sc.nextLine();
        String[] input2 = input.split("");

        Stack<String> arrList = new Stack<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            arrList.push(input2[i]);
        }
        System.out.println(arrList);
        for (String item : arrList) {
            System.out.print(item);
        }
    }
}