package com.charan.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
}

record Address(String firstLine, String secondLine) {
}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "The Weeknd";
    }

    @Bean
    public int age() {
        return 33;
    }

    @Bean
    public Person person() {
        return new Person("Charan Vignesh", 21);
    }

    @Bean
    public Address address() {
        return new Address("Chennai", "India");
    }

    @Bean
    public Person person2(String naam) {
        return new Person(naam, 34);
    }
}
