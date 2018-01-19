package com.shinchan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Pactera on 2018-01-17.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String sayHello(String name) {
//        return restTemplate.getForObject("http://SAY-HELLO/hi?name=" + name, String.class");
        return restTemplate.getForObject("http://say-hello/hi?name=" + name, String.class);
    }
}
