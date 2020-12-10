package com.qq.nacos.consumer.feign.fallback;

import com.qq.nacos.consumer.feign.service.NacosPrviderService;
import org.springframework.stereotype.Component;

@Component
public class NacosProviderFeignFallback implements NacosPrviderService {
    @Override
    public String message(String message) {
        return "出错了，请检查网络";
    }
}
