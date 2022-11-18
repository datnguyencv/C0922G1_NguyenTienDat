package ss11_dsa_stack_queue.check_palindrome;

import java.util.LinkedList;
import java.util.Queue;

public class CheckPalindrome {
    public static void main(String[] args) {
        String input = "mamm";
        String[] input2 = input.split("");

//        for (int i = 0; i <input2.length ; i++) {
//            if (!input2[i].equals(input2[input2.length-1-i])){
//                System.out.println(" chuỗi không là Palindrome");
//                return;
//            }
//        }
//            System.out.println(" chuỗi Palindrome");

        Queue<String> input3 = new LinkedList<>();
        for (int i = 0; i < input2.length; i++) {
            input3.add(input2[i]);
        }
        System.out.println(input3);
        for (int i = 0; i < input3.size(); i++) {
            if (!input2[i].equals(((LinkedList<String>)input3).get(i))) {
                System.out.println(" chuỗi không là Palindrome");
                return;
            }
        }
        System.out.println(" chuỗi Palindrome");
    }

}