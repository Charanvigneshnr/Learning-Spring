package com.charan.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
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
