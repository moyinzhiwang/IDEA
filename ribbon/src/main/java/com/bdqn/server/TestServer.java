package com.bdqn.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestServer {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloBack")
    public String testService(){
        return restTemplate.getForEntity("http://PRODUCER/test",String.class).getBody();
    }

    public String helloBack(){
        System.out.println("降级");
        return "error";

    }
}
