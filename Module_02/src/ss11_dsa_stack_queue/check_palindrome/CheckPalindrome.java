package ss11_dsa_stack_queue.check_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class CheckPalindrome {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi cần kiểm tra:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Queue queue = new LinkedList();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }

        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }

        if (inputString.equals(reverseString)) System.out.println("Input : "+inputString+" _ Is a Palindrome.");
        else System.out.println("Input : "+inputString+" _ Is not Palindrome.");
    }
}