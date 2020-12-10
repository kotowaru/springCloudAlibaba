package com.qq.nacos.consumer.feign.service.impl;

import com.qq.nacos.consumer.feign.service.NacosPrviderService;

public class NacosPrviderServiceImpl implements NacosPrviderService {

    @Override
    public String message(String message) {
        return "nacos feign " + message;
    }
}
