package com.charan.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {
    public void up() {
        System.out.println("Pacman is moving up");
    }

    public void down() {
        System.out.println("Pacman is moving down");
    }

    public void left() {
        System.out.println("Pacman is moving left");
    }

    public void right() {
        System.out.println("Pacman is moving right");
    }
}
