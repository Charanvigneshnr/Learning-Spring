package com.charan.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;

    public GameRunner(@Qualifier("pacManGame") GamingConsole game) {
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
