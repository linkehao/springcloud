package com.controller;

import com.service.DeptService;
import domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DeptController {
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private DeptService deptService;

    @GetMapping("/findAll")
    public List<Dept> findAll(){
        return deptService.findAll();
    }

    @GetMapping("/payment/test")
    public String paymentTest(){
        return "服务器端口号为："+serverPort;
    }

}
