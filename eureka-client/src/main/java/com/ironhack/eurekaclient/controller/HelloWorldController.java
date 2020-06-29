package com.ironhack.eurekaclient.controller;

import com.ironhack.eurekaclient.client.SecondClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldController {
    @Autowired
    private SecondClient secondClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    private static final String secondClientName = "second-client";

    @GetMapping("hello-world")
    public String hello() {
        return "Hello " + secondClient.getWorld();
    }

}
