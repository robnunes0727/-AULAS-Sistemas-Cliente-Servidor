package com.unicid.primeiraaula.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessage {

    @GetMapping("/")
    public String HelloWorld() {
        return "Hello Unicid, estou retornando da camada controller.";
    }
}
