package com.charan.learnspringframework;

import com.charan.learnspringframework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpring {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GameRunner.class).run();
        }
    }
}