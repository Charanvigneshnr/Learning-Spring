package com.charan.learnspringframework;

import com.charan.learnspringframework.game.GameRunner;
import com.charan.learnspringframework.game.MarioGame;
import com.charan.learnspringframework.game.PacManGame;
import com.charan.learnspringframework.game.SuperContraGame;

import java.util.Scanner;

public class App01GamingBasic {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacManGame = new PacManGame();
        Scanner sc = new Scanner(System.in);
        int game = 0;
        while (game <= 3 && game >= 0) {
            System.out.println("Games");
            System.out.println("1. Mario");
            System.out.println("2. Super Contra");
            System.out.println("3. Pac Man");
            System.out.println("What game do you want to play?");
            GameRunner gameRunner;
            game = sc.nextInt();
            switch (game) {
                case 1 -> {
                    gameRunner = new GameRunner(marioGame);
                    gameRunner.run();
                    System.out.println();
                }
                case 2 -> {
                    gameRunner = new GameRunner(superContraGame);
                    gameRunner.run();
                    System.out.println();
                }
                case 3 -> {
                    gameRunner = new GameRunner(pacManGame);
                    gameRunner.run();
                    System.out.println();
                }
                default -> System.out.println("Invalid input. Game exiting!");
            }
        }
    }
}
