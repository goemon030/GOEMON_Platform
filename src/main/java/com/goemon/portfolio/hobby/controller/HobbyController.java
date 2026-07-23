package com.goemon.portfolio.hobby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/hobby")
public class HobbyController {

    @GetMapping
    public String hobby() {
        return "hobby/index";
    }

}
