package com.cute.dearapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeddyController {
    @GetMapping("/teddy")
    public String teddyPage(){
        return "teddy";
    }
}
