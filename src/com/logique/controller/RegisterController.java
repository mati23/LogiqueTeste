package com.logique.controller;

import com.logique.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/register")
public class RegisterController {
    @GetMapping("/")
    public String index(){
        return "register";
    }
    @PostMapping("/register")
    public String register(@ModelAttribute("user") User user){
        System.out.println(user);
        return "index";
    }
}
