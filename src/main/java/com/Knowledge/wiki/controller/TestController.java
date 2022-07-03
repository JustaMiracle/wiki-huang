package com.Knowledge.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;


@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}