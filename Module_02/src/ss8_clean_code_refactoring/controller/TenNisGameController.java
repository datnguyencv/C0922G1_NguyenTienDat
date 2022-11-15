package ss8_clean_code_refactoring.controller;

import java.util.Scanner;
import static ss8_clean_code_refactoring.model.TennisGame.readScore;

public class TenNisGameController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Score of player1");
        int player1Score = Integer.parseInt(scanner.nextLine());
        System.out.println("Score of player2");
        int player2Score = Integer.parseInt(scanner.nextLine());
        System.out.println(readScore("Code One", "Gym Two",
                player1Score, player2Score));
    }


}

