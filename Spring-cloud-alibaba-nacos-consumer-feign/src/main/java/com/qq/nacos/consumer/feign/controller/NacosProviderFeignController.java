package com.qq.nacos.consumer.feign.controller;

import com.qq.nacos.consumer.feign.service.NacosPrviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderFeignController {

    @Autowired
    private NacosPrviderService nacosPrviderService;

    @GetMapping(value = "/feign/message/{message}")
    public String message(@PathVariable String message){
        return nacosPrviderService.message(message);
    }
}
