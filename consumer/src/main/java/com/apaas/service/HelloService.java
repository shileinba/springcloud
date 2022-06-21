package com.apaas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: shilei
 * @DateTime: 2022/6/20 20:08
 * @Description : TODO
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://PROVIDER/hi?name="+name,String.class);
    }

}
