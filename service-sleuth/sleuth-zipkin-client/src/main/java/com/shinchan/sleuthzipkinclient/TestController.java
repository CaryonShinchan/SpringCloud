package com.shinchan.sleuthzipkinclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/call")
    public String callHome(){
        System.out.println("call trace service-hi!");
        return restTemplate.getForObject("http://localhost:8989/hello", String.class);
    }

    @RequestMapping("/hi")
    public String info(){
        return "I'm service-hi!";
    }
}
