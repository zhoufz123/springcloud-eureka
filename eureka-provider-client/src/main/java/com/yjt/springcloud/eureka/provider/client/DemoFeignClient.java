package com.yjt.springcloud.eureka.provider.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Component
@FeignClient(name = "spring-cloud-eureka-provider")
public interface DemoFeignClient {

    @RequestMapping(value = "/hello")
    String demo(@RequestParam(value = "name") String name);
}
