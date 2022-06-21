package com.apaas.service;

import org.springframework.stereotype.Component;

/**
 * @Author: shilei
 * @DateTime: 2022/6/20 21:49
 * @Description : TODO
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
