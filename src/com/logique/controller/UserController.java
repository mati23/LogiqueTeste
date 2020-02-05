package com.logique.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class UserController {
    @GetMapping("/")
    public String index(Model user){
        user.addAttribute("message","Hello World");
        return "index";
    }
}
