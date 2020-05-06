package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1)
public class HelloController {

    @GetMapping("/hello")   // 2)
    public String hello() {
        return "hello";
    }

}
