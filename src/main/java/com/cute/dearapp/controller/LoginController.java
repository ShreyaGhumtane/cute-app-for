package com.cute.dearapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // load login.html from templates
    }

    // Hardcoded login for one user
    @PostMapping("/login")
    public String doLogin(@RequestParam String username, @RequestParam String password, Model model) {
        if ("sai".equals(username) && "dudu".equals(password)) {
            return "redirect:/teddy"; // go to teddy page
        } else {
            model.addAttribute("error", "Oops! Wrong credentials 🥺");
            return "login"; // back to login page
        }
    }
}
