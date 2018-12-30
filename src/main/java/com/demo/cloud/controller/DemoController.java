package com.demo.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.cloud.service.ConsumerService;

@RestController
public class DemoController {
	
	@Autowired
    ConsumerService consumerService;
	
	@GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer();
    }

}
