package com.qq.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/message/{message}",method = RequestMethod.GET)
    public String message(@PathVariable String message){
        return "Nacos " + message + " port: " + port;
    }
}
