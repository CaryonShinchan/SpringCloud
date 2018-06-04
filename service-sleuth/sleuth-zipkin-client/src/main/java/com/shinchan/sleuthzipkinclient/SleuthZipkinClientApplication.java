package com.shinchan.sleuthzipkinclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SleuthZipkinClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthZipkinClientApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler getAlwaysSampler(){
        return new AlwaysSampler();
    }

    @RequestMapping("/hi")
    public String hi(String name) {
        return name;
    }
}
