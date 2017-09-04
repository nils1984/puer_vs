package com.puer.confclt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ConfClientApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfClientApp.class).web(true).run(args);
    }
}