package com.puer.confserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@EnableConfigServer
@SpringBootApplication
public class ConfServerApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfServerApp.class).web(true).run(args);
    }
}