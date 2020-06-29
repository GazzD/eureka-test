package com.ironhack.eurekaclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "second-client")
public interface SecondClient {
    @GetMapping("/world")
    public String getWorld();

}
