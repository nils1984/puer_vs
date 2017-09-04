package com.puer.confclt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class TestController {
    @Value("${ip}")
    private String ip;
    
    @Value("${port}")
    private String port;
    
    @RequestMapping("/ip")
    public String from() {
        return this.ip;
    }
}