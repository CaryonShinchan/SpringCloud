package com.shinchan.sleuthzipkinclienttwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/callTwo")
    public String callHome() {
        System.out.println("call trace service-hello!");
        return restTemplate.getForObject("http://localhost:8988/hi", String.class);
    }

    @RequestMapping("/hello")
    public String info(){
        return "I'm service-hello!";
    }

}
