package com.puer.vsreg;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class VsRegApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(VsRegApp.class).web(true).run(args);
    }
}
