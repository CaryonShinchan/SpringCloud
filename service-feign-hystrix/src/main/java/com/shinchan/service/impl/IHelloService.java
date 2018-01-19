package com.shinchan.service.impl;

import com.shinchan.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by Pactera on 2018-01-19.
 */
@Service
public class IHelloService implements HelloService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "service:" + name;
    }
}
