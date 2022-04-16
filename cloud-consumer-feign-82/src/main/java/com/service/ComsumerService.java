package com.service;

import domain.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "CLOUD-PAYMENT-DEPT")
public interface ComsumerService {
    @GetMapping("/findAll")
    List<Dept> findAll();

    @GetMapping("/payment/test")
    String paymentTest();
}
