package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: demoagain
 * @author: Programming Queen
 * @create: 2019-11-12 21:09
 **/

@Controller
public class HomeController {
    @RequestMapping("home")
    public String home() {
        return "home";
    }
}

