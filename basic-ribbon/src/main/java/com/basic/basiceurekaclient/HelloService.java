package com.basic.basiceurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuhuayo
 * @date 2018/5/8 16:18
 */
@Service
public class HelloService {

    private final RestTemplate restTemplate;

    @Autowired
    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String hiService(String name){
        return restTemplate.getForObject("http://service-ribbon/hi?name=", String.class);
    }
}
