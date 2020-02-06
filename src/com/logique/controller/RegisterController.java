package com.logique.controller;

import com.logique.dao.UserDAO;
import com.logique.dao.UserDAOImp;
import com.logique.model.User;
import com.logique.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/register")
public class RegisterController {
    private UserService userService;

    @Autowired(required = true)
    public void setUserService(UserService userService){
        this.userService  = userService;
    }

    @GetMapping("/")
    public String index(){
        return "register";
    }
    @PostMapping("/register")
    public String register(@ModelAttribute("user") User user){
        this.userService.insert(user);
        return "index";
    }
}
