package com.yjt.springcloud.eureka.consumer.demo.controller;

import com.yjt.springcloud.eureka.provider.client.DemoFeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Resource
    DemoFeignClient demoFeignClient;

    @RequestMapping("/index/{name}")
    public String index(@PathVariable("name") String name) {
        return demoFeignClient.demo(name);
    }
}
