package com.goemon.portfolio.hobby.music.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/hobby/music")
public class MusicController {

    @GetMapping
    public String music() {
        return "hobby/music";
    }

}
