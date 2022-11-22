package ss13_search_algorithms.practice;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String :");
        String inputString = scanner.nextLine();
        int[] frequentCha = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            frequentCha[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (frequentCha[i]>max){
                max = frequentCha[i];
                character = (char)i;
            }
        }
        System.out.println("The most appearing letter is "+character+" with a frequency of "+max+" times");
    }
}
