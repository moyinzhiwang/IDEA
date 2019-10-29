package com.bdqn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @RequestMapping("/test")
    public String ribbonConsumer(){
        String message = "hello1";
     return message;
    }
    @RequestMapping("/test1")
    public  String testFeign(@RequestParam("name") String name){
        return name+2;
    }
}
