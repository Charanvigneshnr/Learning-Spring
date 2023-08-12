package com.charan.learnspringframework.game;

public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go inside pipe");
    }

    public void left() {
        System.out.println("Run Back");
    }

    public void right() {
        System.out.println("Advance");
    }
}
