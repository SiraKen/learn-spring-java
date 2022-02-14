package com.example.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String getHello() {
        String[] list = {"John", "Mark", "Matthew", "Lukas"};
        System.out.println(Arrays.toString(list));
        return Arrays.toString(list);
    }

}
