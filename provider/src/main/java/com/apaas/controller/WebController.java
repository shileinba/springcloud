package com.apaas.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shilei
 * @DateTime: 2022/6/20 19:27
 * @Description : TODO
 */
@RestController
public class WebController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

}
