package com.charan.learnspringframework.game;

public class GameRunner {
    GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        String str = game.getClass().toString().substring(43);
        System.out.println("Game Started: " + str);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
