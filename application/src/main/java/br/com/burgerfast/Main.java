package br.com.burgerfast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.burgerfast"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}