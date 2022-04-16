package com.comtroller;

import domain.Dept;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ConsumerController {

    public static final String url="http://CLOUD-PAYMENT-DEPT";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/findAll")
    public List<Dept> findAll(){
        return restTemplate.getForObject(url+"/findAll",List.class);
    }

    @GetMapping("/consumer/payment/test")
    public String consumerTest(){
        return restTemplate.getForObject(url+"/payment/test",String.class);
    }
}
