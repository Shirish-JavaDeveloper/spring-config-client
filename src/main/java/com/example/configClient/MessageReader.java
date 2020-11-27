package com.example.configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/rest")
public class MessageReader {
    @Value("${host: localhost}")
    private String host;
    @Value("${spring1.datasource1.username1: defaultUser}")
    private String userName;

    @RequestMapping("/host")
    public String getHost(){
        return host;
    }

    @RequestMapping("/userName")
    public String getUserName(){
        return userName;
    }

}
