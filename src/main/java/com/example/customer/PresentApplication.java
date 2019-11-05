package com.example.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@RibbonClient(name = "customer-ribbon")
public class PresentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PresentApplication.class, args);
    }

}
