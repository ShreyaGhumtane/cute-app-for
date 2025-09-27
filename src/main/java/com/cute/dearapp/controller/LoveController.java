package com.cute.dearapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoveController {
    @GetMapping("/love")
    public String lovePage(){
        return "love"; //page asking question
    }

    @GetMapping("/love/answer")
    public String loveAnswer(@RequestParam String answer, Model model){
        if("yes".equalsIgnoreCase(answer)){
            return "waiting";
        }
        else{
            return "onlyYes";
        }
    }

    @GetMapping("/onlyYes/answer")
    public String onlyYesAnswer(@RequestParam String answer){
        return "waiting";
    }
}
