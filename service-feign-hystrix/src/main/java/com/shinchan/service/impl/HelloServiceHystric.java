package com.shinchan.service.impl;

import com.shinchan.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by Pactera on 2018-01-19.
 */
@Component
public class HelloServiceHystric implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
