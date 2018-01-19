package com.shinchan.controller;

import com.shinchan.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pactera on 2018-01-19.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }

}
