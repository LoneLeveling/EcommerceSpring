package com.example.demo.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ControllerDemo {
//    private static final Logger logger = (Logger) LoggerFactory.getLogger(ControllerDemo.class);
    @GetMapping(path = "/getSecretMessage")
    public String getSecretMessage()
    {
//        logger.info("Request hit /getSecretMessage");
        return "cool you got no secret msg here";
    }
}
