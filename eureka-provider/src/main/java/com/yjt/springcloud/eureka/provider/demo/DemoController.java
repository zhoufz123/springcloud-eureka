package com.yjt.springcloud.eureka.provider.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "provider: hello "+name+"，messge ...";
    }
}
