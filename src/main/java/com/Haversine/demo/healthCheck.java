package com.Haversine.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class healthCheck {

    @GetMapping("/health")
    public void health(){
        System.out.println("OK");
    }
}
