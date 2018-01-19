package com.shinchan.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Pactera on 2018-01-19.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String sayHello(String name) {
        return restTemplate.getForObject("http://say-hello/hi?name="+name,String.class);
    }

    public String helloError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
