package com.example.song.controller;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s1 = "([]){}";
        String s2 = "(]";
        String s3 = "()(()()()()())";
        String s4 = "";
        String s9 = "()";
        String s10 = "()[]{}";
        String s5 = "((()))";
        String s7 = "([){]}";

        boolean res1 = solution(s1);
        boolean res2 = solution(s2);
        boolean res3 = solution(s3);
        boolean res4 = solution(s4);
        boolean res5 = solution(s5);
        boolean res7 = solution(s7);
        boolean res9 = solution(s9);
        boolean res10 = solution(s10);


        System.out.println("s1  : " + res1); // true
        System.out.println("s2  : " + res2); // false
        System.out.println("s3: " + res3); // true
        System.out.println("s4  : " + res4); // true
        System.out.println("s5: " + res5); // true
        System.out.println("s7  : " + res7); // true
        System.out.println("s9  : " + res9); // false
        System.out.println("s10     : " + res10); // false
    }
    public static boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || stack.pop() != matchingBracket(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    static char matchingBracket(char c) {
        return (c == ')' ? '(' : (c == ']' ? '[' : '{'));
    }

//    public static boolean solution(String s) {
//        if (s == null || s.length() == 0) {
//            return true;
//        }
//        Stack<Character> stack = new Stack<>();
//        for (char c : s.toCharArray()) {
//            if (c == '(' || c == '[' || c == '{') {
//                stack.push(c);
//            } else if (c == ')' || c == ']' || c == '}') {
//                if (stack.isEmpty()) {
//                    return false;
//                } else {
//                    char top = stack.peek();
//                    if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
//                        stack.pop();
//                    }
//                    // Không có câu lệnh return false ở đây
//                }
//            } else {
//                return false;
//            }
//        }
//        return stack.isEmpty();
//    }
}
