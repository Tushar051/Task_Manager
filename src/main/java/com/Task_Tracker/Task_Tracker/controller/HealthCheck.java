package com.Task_Tracker.Task_Tracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tracker")
public class HealthCheck {

    @GetMapping
    public String healthCheck(){
        return "OK";
    }
}
