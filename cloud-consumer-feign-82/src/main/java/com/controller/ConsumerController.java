package com.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.service.ComsumerService;
import domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {
    @Autowired
    private ComsumerService comsumerService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/consumer/findAll")
    public List<Dept> feignFindAll(){
        List<Dept> all = comsumerService.findAll();
        return all;
    }

    @GetMapping("/consumer/payment/test")
    public String paymentTest(){
        return comsumerService.paymentTest();
    }
}
