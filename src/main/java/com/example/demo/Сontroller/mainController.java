package com.example.demo.Сontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class mainController {
    @RequestMapping("/")
    public String home (){return "Hello";}
}
