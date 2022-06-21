package com.apaas.controller;

import com.apaas.service.HelloErrorService;
import com.apaas.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shilei
 * @DateTime: 2022/6/20 20:09
 * @Description : TODO
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @Autowired
    HelloErrorService helloErrorService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloErrorService.hiService(name);
    }


}

