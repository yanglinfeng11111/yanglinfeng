package com.cloud.discovery.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigTestController {

    @Value("${name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return name;
    }
}
