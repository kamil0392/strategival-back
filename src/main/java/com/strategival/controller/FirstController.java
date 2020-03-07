package com.strategival.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class FirstController {

    @GetMapping
    public String helloStrategival() {
        return "Hello this is strategival!!!";
    }
}
