package com.puer.confServer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class ConfServer 
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(ConfServer.class).web(true).run(args);
    }
}
