package com.example.jenkins.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hbh5274@gmail.com on 2020-09-04
 * Github : http://github.com/bhhan5274
 */

@RestController
@RequestMapping("/")
public class WelcomeController {
    @GetMapping
    public String hello(){
        return "Hello World!!!";
    }
}
