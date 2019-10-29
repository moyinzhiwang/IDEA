package com.bdqn.controller;

import com.bdqn.server.TestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
    @Autowired
    private TestServer testServer;

    @RequestMapping("/test")
    public String ribbonConsumer(){
      return testServer.testService();
    }
}
