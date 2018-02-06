package com.puer.wsclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class WsclientApp 
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(WsclientApp.class).web(true).run(args);
    }
}
