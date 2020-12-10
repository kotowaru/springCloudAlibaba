package com.qq.nacos.consumer.feign.service;

import com.qq.nacos.consumer.feign.fallback.NacosProviderFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "nacos-provider",fallback = NacosProviderFeignFallback.class)
public interface NacosPrviderService {
    @RequestMapping(value = "/message/{message}",method = RequestMethod.GET)
    public String message(@PathVariable String message);
}
